package com.bo02;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: bo
 * @Date: 2022/07/11/5:08
 * @Description: 在人间已是癫，何苦要上青天，不如温柔同眠
 */
//假设我们定义一种收入，需要给它报税，那么先定义一个Income类：
public class Income {
    //受保护的成员变量
    protected double income;

    //无参构造
    public Income() {
    }

    //有参构造
    public Income(double income) {
        this.income = income;
    }

    //定义获取税收的方法
    public double getTax() {
        //Income类型的工资的税收是10%
        return income * 0.1;
    }
    //定义获取总税收的方法
    public double totalTax(Income... incomes) {
        //计算税收的总合
        double total = 0;
        for (Income income : incomes) {
            total = total + income.getTax();
        }
        return total;
    }
}
