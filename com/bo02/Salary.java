package com.bo02;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: bo
 * @Date: 2022/07/11/5:09
 * @Description: ���˼�����񲣬�ο�Ҫ�����죬��������ͬ��
 */
////���ڹ������룬���Լ�ȥһ����������ô���ǿ��Դ�Income������SalaryIncome������дgetTax()
public class Salary extends Income {
    //�޲ι���
    public Salary() {
    }

    //�вι���
    public Salary(double income) {
        super(income);
    }

    @Override
    public double getTax() {
        //���Salary�Ĺ������ڻ����5000,˰Ϊ0
        if (income <= 5000) {
            return 0;
        }
        //Salary����5000�������Ĳ���*0.2����˰
        return (income - 5000) * 0.2;
    }
}
