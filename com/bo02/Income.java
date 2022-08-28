package com.bo02;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: bo
 * @Date: 2022/07/11/5:08
 * @Description: ���˼�����񲣬�ο�Ҫ�����죬��������ͬ��
 */
//�������Ƕ���һ�����룬��Ҫ������˰����ô�ȶ���һ��Income�ࣺ
public class Income {
    //�ܱ����ĳ�Ա����
    protected double income;

    //�޲ι���
    public Income() {
    }

    //�вι���
    public Income(double income) {
        this.income = income;
    }

    //�����ȡ˰�յķ���
    public double getTax() {
        //Income���͵Ĺ��ʵ�˰����10%
        return income * 0.1;
    }
    //�����ȡ��˰�յķ���
    public double totalTax(Income... incomes) {
        //����˰�յ��ܺ�
        double total = 0;
        for (Income income : incomes) {
            total = total + income.getTax();
        }
        return total;
    }
}
