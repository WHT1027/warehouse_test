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
	 * �������������ʳƷ��Ϣ
	 * @return
	 */
	@RequestMapping(value="/getAllFoods",method=RequestMethod.GET)
	@ResponseBody
	public JsonMsg getAllFoods() {
		List<Foods> foods = foodsService.getAllFoods();
		return JsonMsg.success().add("foods", foods);
	}
	
	/**
	 * ��ҳ��ѯʳƷ��Ϣ��
	 * @param pn
	 * @return
	 */
	@RequestMapping("/getfoods")
	@ResponseBody
	public JsonMsg getFoodsWithJson(
			@RequestParam(value = "pn", defaultValue = "1") Integer pn) {
		// ����PageHelper��ҳ���
		// �ڲ�ѯ֮ǰֻ��Ҫ���ã�����ҳ�룬�Լ�ÿҳ�Ĵ�С
		PageHelper.startPage(pn, 5);
		// startPage��������������ѯ����һ����ҳ��ѯ
		List<Foods> emps = foodsService.getAllFoods();
		// ʹ��pageInfo��װ��ѯ��Ľ����ֻ��Ҫ��pageInfo����ҳ������ˡ�
		// ��װ����ϸ�ķ�ҳ��Ϣ,������ѯ���������ݣ�����������ʾ��ҳ��
		PageInfo page = new PageInfo(emps, 5);
		return JsonMsg.success().add("pageInfo", page);
	}

	/**
	 * ����ʳƷId��ѯʳƷ��Ϣ
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
	 * �޸�ʳƷ��Ϣ
	 * @param food
	 * @param request
	 * @return
	 */
	@ResponseBody
	@RequestMapping(value="/updatefood/{foodId}",method= RequestMethod.PUT)
	public JsonMsg updateFood(Foods food,HttpServletRequest request){
		System.out.println("�������е�ֵ��"+request.getParameter("foodTypeId"));
		System.out.println("�������е�ֵ��"+request.getParameter("foodNums"));
		System.out.println("��Ҫ���µ�ʳƷID��"+request.getParameter("foodId"));
		System.out.println(food);
		foodsService.updateFood(food);
		return JsonMsg.success();
	}

	/**
	 * �����޸�ʳƷ��Ϣ
	 * @return
	 */
	@ResponseBody
	@RequestMapping(value = "/updatefoodtest/{foodId}",method= RequestMethod.PUT)
	public JsonMsg updateFoodTest(@PathVariable("foodId") Integer foodId){
		System.out.println(foodId);
		Foods food = new Foods();
		food.setFoodId(foodId);
		food.setFoodName("����");
		food.setFoodNums(60);
		foodsService.updateFood(food);
		return JsonMsg.success().add("ʳƷ",food);
	}

	
	/**
	 * ʳƷ��������һ
	 * ����ɾ����1-2-3
	 * ����ɾ����1
	 * @param ids
	 * @return
	 */
	@ResponseBody
	@RequestMapping(value="/deletefood/{ids}",method= RequestMethod.DELETE)
	public JsonMsg deleteEmp(@PathVariable("ids")String ids){
		//����ɾ��
		if(ids.contains("-")){
			List<Integer> del_ids = new ArrayList<Integer>();
			String[] str_ids = ids.split("-");
			//��װid�ļ���
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
