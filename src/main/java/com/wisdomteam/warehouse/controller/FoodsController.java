package com.wisdomteam.warehouse.controller;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.wisdomteam.warehouse.bean.Foods;
import com.wisdomteam.warehouse.service.FoodsService;
import com.wisdomteam.warehouse.utils.JsonMsg;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/foods")
public class FoodsController {
	
	@Autowired
	FoodsService foodsService;
	
	/**
	 * 返回请求的所有食品信息
	 * @return
	 */
	@RequestMapping(value="/getAllFoods",method=RequestMethod.GET)
	@ResponseBody
	public JsonMsg getAllFoods() {
		List<Foods> foods = foodsService.getAllFoods();
		return JsonMsg.success().add("foods", foods);
	}
	
	/**
	 * 分页查询食品信息。
	 * @param pn
	 * @return
	 */
	@RequestMapping("/getfoods")
	@ResponseBody
	public JsonMsg getFoodsWithJson(
			@RequestParam(value = "pn", defaultValue = "1") Integer pn) {
		// 引入PageHelper分页插件
		// 在查询之前只需要调用，传入页码，以及每页的大小
		PageHelper.startPage(pn, 5);
		// startPage后面紧跟的这个查询就是一个分页查询
		List<Foods> emps = foodsService.getAllFoods();
		// 使用pageInfo包装查询后的结果，只需要将pageInfo交给页面就行了。
		// 封装了详细的分页信息,包括查询出来的数据，传入连续显示的页数
		PageInfo page = new PageInfo(emps, 5);
		return JsonMsg.success().add("pageInfo", page);
	}

	/**
	 * 根据食品Id查询食品信息
	 * @param id
	 * @return
	 */
	@RequestMapping(value="/getfood/{id}",method= RequestMethod.GET)
	@ResponseBody
	public JsonMsg getFoodWithId(@PathVariable("id")Integer id) {
		//System.out.println(id);
		Foods food = foodsService.getFoodWithId(id);
		return JsonMsg.success().add("food", food);
	}
	
	/**
	 * 修改食品信息
	 * @param food
	 * @param request
	 * @return
	 */
	@ResponseBody
	@RequestMapping(value="/updatefood/{foodId}",method= RequestMethod.PUT)
	public JsonMsg updateFood(Foods food,HttpServletRequest request){
		System.out.println("请求体中的值："+request.getParameter("foodTypeId"));
		System.out.println("请求体中的值："+request.getParameter("foodNums"));
		System.out.println("将要更新的食品ID："+request.getParameter("foodId"));
		System.out.println(food);
		foodsService.updateFood(food);
		return JsonMsg.success();
	}

	/**
	 * 测试修改食品信息
	 * @return
	 */
	@ResponseBody
	@RequestMapping(value = "/updatefoodtest/{foodId}",method= RequestMethod.PUT)
	public JsonMsg updateFoodTest(@PathVariable("foodId") Integer foodId){
		System.out.println(foodId);
		Foods food = new Foods();
		food.setFoodId(foodId);
		food.setFoodName("李子");
		food.setFoodNums(60);
		foodsService.updateFood(food);
		return JsonMsg.success().add("食品",food);
	}

	
	/**
	 * 食品单个二合一
	 * 批量删除：1-2-3
	 * 单个删除：1
	 * @param ids
	 * @return
	 */
	@ResponseBody
	@RequestMapping(value="/deletefood/{ids}",method= RequestMethod.DELETE)
	public JsonMsg deleteEmp(@PathVariable("ids")String ids){
		//批量删除
		if(ids.contains("-")){
			List<Integer> del_ids = new ArrayList<Integer>();
			String[] str_ids = ids.split("-");
			//组装id的集合
			for (String string : str_ids) {
				del_ids.add(Integer.parseInt(string));
			}
			foodsService.deleteBatch(del_ids);
		}else{
			Integer id = Integer.parseInt(ids);
			foodsService.deleteFood(id);
		}
		return JsonMsg.success();
	}
}
