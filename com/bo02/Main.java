package com.bo02;

import javax.swing.*;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: bo
 * @Date: 2022/07/11/19:16
 * @Description: ���˼�����񲣬�ο�Ҫ�����죬��������ͬ��
 */
public class Main {
    public static void main(String[] args) {
        long start = System.currentTimeMillis();
        Income s = new Salary(78968);
        Income i = new Income(4674);
        Income sc = new StateCouncilSpecialAllowance(15000);
        Income[] incomes = new Income[]{
                s, i, sc
        };
        System.out.println(s.totalTax(incomes));

        for (int j = 0; j <= s.income; j++) {
            System.out.println(j);
        }
        long end = System.currentTimeMillis();
        System.out.println(s.getClass());
        System.out.println("��ʱ��" + (end - start) + "����");
    }
}

