package com.lxyk.controller;

import com.lxyk.pojo.AppInfo;
import com.lxyk.pojo.Message;
import com.lxyk.pojo.User;
import com.lxyk.pojo.UserID;
import com.lxyk.service.PUBGService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;


import java.sql.Timestamp;
import java.util.List;

/**
 * @ClassName PUBGController
 * @Description TODO
 * @Author FJQ
 * @Date 2022/5/30 21:33
 * @Version 1.0
 **/
@Controller
@RequestMapping("/pubg")
public class PUBGController {
    String key = "secret"; // 密钥
    @Autowired
    @Qualifier("PUBGServiceImpl")
    private PUBGService pubgService;

    @ResponseBody
    @RequestMapping(value = "/mytest",method = RequestMethod.GET)
    public String list(){
      /*  System.out.println("--------------");

        Version version = bookService.queryVersion();
        System.out.println("查询版本："+version.toString());*/


        return "version";
    }

    @ResponseBody
    @RequestMapping(value = "/IsStart",method = RequestMethod.GET)
    public int IsStart(){
        System.out.println("--------------");

        int b = pubgService.queryIsStart();

        return b;
    }
    @ResponseBody
    @RequestMapping(value = "/getAllUser",method = RequestMethod.GET)
    public List<User> getAll(){
        System.out.println("--------------");

        List<User> users = pubgService.queryAllUser();

        return users;
    }
    @ResponseBody
    @RequestMapping(value = "/appVersion",method = RequestMethod.GET)
    public AppInfo getAppVersion(){

        AppInfo appInfo = pubgService.queryAppInfo();

        return appInfo;
    }
    @ResponseBody
    @RequestMapping(value = "/getMessage",method = RequestMethod.GET)
    public List<Message> getMessage(){

        List<Message> messages = pubgService.queryMessage();

        return messages;
    }



   // @ResponseBody
    @PostMapping("/statistics")
    public Integer statistics(UserID userID){
      //  new Gson().toJson();
        String device_code = userID.getDevice_code();
        String versionName = userID.getVersionName();
        System.out.println("接收到参数:"+device_code+"--"+versionName);
        //更新时间
        Timestamp timestamp = new Timestamp(System.currentTimeMillis());
       /* if (versionName == null){
            versionName = "空";
        }*/

        Integer integer = pubgService.updateStatistics(device_code, timestamp,versionName);
        return integer;
    }

    @ResponseBody
    @RequestMapping(value = "/timeTest",method = RequestMethod.GET)
    public Integer timeTest(){


        Timestamp timestamp = new Timestamp(System.currentTimeMillis());
        Integer integer = pubgService.timeTest(timestamp);

        return integer;
    }

   /* @PostMapping("/start")
    public String statistics(@RequestParam("thisId") String thisId){
      //  new Gson().toJson();
        String s = decryptXOR(thisId, key);

        return s;
    }*/
    public static String decryptXOR(String encryptedText, String key) {
        StringBuilder decryptedText = new StringBuilder();
        for (int i = 0; i < encryptedText.length(); i++) {
            decryptedText.append((char) (encryptedText.charAt(i) ^ key.charAt(i % key.length())));
        }
        return decryptedText.toString();
    }
   /* //修改操作
    @RequestMapping("/updateClass/{classID}/{className}/{classJP}/{stuName}/{chinese}/{math}/{english}/{score}")
    public String update(@PathVariable("classId") Integer getid ,@PathVariable("className") String className,@PathVariable("stuName") String stuName,@PathVariable("chinese")Float chinese,@PathVariable("math")Float math,@PathVariable("english")Float english,@PathVariable("score")Float score,Model model){
        model.addAttribute("classId",getid);
        model.addAttribute("className",className);
        model.addAttribute("stuName",stuName);
        model.addAttribute("math",math);
        model.addAttribute("english",english);
        model.addAttribute("score",score);
        return "update";
    }
    @RequestMapping("/updateClass2")
    public String update2(String classname,Integer newClassID,String classJP,String stuName,float chinese,float math,float english,float score){
        Class aClass = new Class(classname,newClassID,classJP,stuName,chinese,math,english,score);
        System.out.println(classname+newClassID+classJP);
        System.out.println(aClass);
        classService.updateClass(aClass);
        return "update";
    }

    //添加操作
    @RequestMapping("/insertClass")
    public String insert(){
        return "insert";
    }
    @RequestMapping("/insertClass2")
    public String insert2(@RequestParam String classname,Integer classID,String classJP,String stuName,float chinese,float math,float english,float score){
        Class aClass = new Class(classname, classID,classJP,stuName,chinese,math,english,score);
        classService.insertClass(aClass);
        return "allClass";
    }
    //删除操作
    @RequestMapping("/deleteClass/{classId}")
    public String delUser(@PathVariable("classId") Integer getid){
        System.out.println(getid+"------------------");
        classService.deleteClass(getid);
        return "allClass";
    }
    @RequestMapping("/deleteClass2")
    public String delUser2(Integer classID){
        classService.deleteClass(classID);
        return "allClass";
    }*/


}
