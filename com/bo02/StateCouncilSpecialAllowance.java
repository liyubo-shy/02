package com.bo02;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: bo
 * @Date: 2022/07/11/5:13
 * @Description: ���˼�����񲣬�ο�Ҫ�����죬��������ͬ��
 */
//��������ܹ���Ժ�����������ô���չ涨������ȫ����˰��
public class StateCouncilSpecialAllowance extends Income{
    //�޲ι���
    public StateCouncilSpecialAllowance() {
    }

    //�вι���
    public StateCouncilSpecialAllowance(double income) {
        super(income);
    }

    @Override
    public double getTax(){
        //StateCouncilSpecialAllowance���͵Ĺ���0˰��
        return 0;
    }
}
