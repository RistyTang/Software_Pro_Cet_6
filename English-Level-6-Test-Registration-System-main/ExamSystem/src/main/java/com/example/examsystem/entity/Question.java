package com.example.examsystem.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

import java.io.Serializable;

//MyBatis ORM(Object-Relational Mapping)
@Data   //set、get
@NoArgsConstructor  //无参构造函数
@AllArgsConstructor //全参构造函数
@Accessors(chain =true)
public class Question implements Serializable {    //可序列化，方便保存对象
    @TableId(value = "id",type= IdType.AUTO)
    private Integer id;//id唯一标识
    private String questionName;
    private String questionDescription;
    private String optionA;
    private String optionB;
    private String optionC;
    private String optionD;
    private String answer;
    private Integer typeId;//标识题目类型：1单选2填空3作文翻译4文章
    private Integer score;//这道题的分数

    private static final long serialVersionUID = 1L;    //序列化和反序列化时校验防止出错，1L表示这是这个类的第一个版本

}
