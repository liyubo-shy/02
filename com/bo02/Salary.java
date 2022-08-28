package com.bo02;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: bo
 * @Date: 2022/07/11/5:09
 * @Description: 在人间已是癫，何苦要上青天，不如温柔同眠
 */
////对于工资收入，可以减去一个基数，那么我们可以从Income派生出SalaryIncome，并覆写getTax()
public class Salary extends Income {
    //无参构造
    public Salary() {
    }

    //有参构造
    public Salary(double income) {
        super(income);
    }

    @Override
    public double getTax() {
        //如果Salary的工资少于或等于5000,税为0
        if (income <= 5000) {
            return 0;
        }
        //Salary超过5000，超出的部分*0.2即是税
        return (income - 5000) * 0.2;
    }
}
