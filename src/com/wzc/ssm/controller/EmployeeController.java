package com.wzc.ssm.controller;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.wzc.ssm.beans.Employee;
import com.wzc.ssm.services.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
public class EmployeeController {

    @Autowired
    private EmployeeService employeeService;


//    //显示所有员工的信息
//
//    @RequestMapping(value = "emps")
//    public ModelAndView getAllEmps(){
//
//        List<Employee> emps = employeeService.getAllEmps();
//        ModelAndView mav = new ModelAndView();
//        mav.setViewName("list");
//        mav.addObject("emps",emps);
//        return mav;
//    }
    /*
    分页显示所有信息
    */

    @RequestMapping(value = "emps",method = RequestMethod.GET)
    public String pageList(ModelMap map,
                           @RequestParam(defaultValue = "1",required = true,value = "page")Integer page){
        //每页显示的记录数
        Integer pageSize=4;
        //分页查询
        PageHelper.startPage(page,pageSize);
        List<Employee> emps = employeeService.getAllEmps();
        PageInfo<Employee> pageInfo = new PageInfo<Employee>(emps);
        map.addAttribute("pageInfo",pageInfo);
        return "list";
    }


    /*
    跳转到增加页面
     */
    @RequestMapping("addgo")
    public ModelAndView addgo(){
        ModelAndView mav = new ModelAndView("add");
        return mav;
    }
    /*
    添加
     */
    @RequestMapping("add")
    public ModelAndView addEmployee(Employee employee){
        employeeService.addEmployee(employee);
        ModelAndView mav = new ModelAndView("redirect:/emps");
        return mav;
    }
    /*
    跳到修改页面
     */
    @RequestMapping("editgo")
    public ModelAndView editgo(Integer id){
        Employee employee = employeeService.get(id);
        ModelAndView mav = new ModelAndView("edit");
        mav.addObject("employee",employee);
        return mav;
    }

    /*
    修改
     */
    @RequestMapping("edit")
    public ModelAndView updateEmployee(Employee employee){
        employeeService.updateEmployee(employee);
        ModelAndView mav = new ModelAndView("redirect:/emps");
        return mav;
    }

    /*
    删除
     */
    @RequestMapping(value = "delete")
    public ModelAndView deleteEmployee(Integer id){

        employeeService.deleteEmployee(id);
        ModelAndView mav = new ModelAndView("redirect:/emps");
        return mav;
    }
}
