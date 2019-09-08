package com.atguigu.gmall.service;

import com.atguigu.gmall.bean.BaseAttrInfo;
import com.atguigu.gmall.bean.BaseCatalog1;
import com.atguigu.gmall.bean.BaseCatalog2;
import com.atguigu.gmall.bean.BaseCatalog3;

import java.util.List;

public interface ManageService {
     //查询一级分类
    public List<BaseCatalog1> getCatalog1();
     //查询二级分类，根据一级分类ID
    public List<BaseCatalog2> getCatalog2(String catalog1Id);
     //查询 三级分类，根据二级分类ID
    public List<BaseCatalog3> getCatalog3(String catalog2Id);
    //根据平台分类查询平台属性
    public List<BaseAttrInfo> getAttrList(String catalog3Id);
    //根据平台属性的id查询平台属性详情
    public BaseAttrInfo getBaseAttrInfo(String attrid);
    //保存平台属性
    public void savaAttrInfo(BaseAttrInfo baseAttrInfo);
    //删除平台属性
}
