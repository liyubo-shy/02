package com.bo02;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: bo
 * @Date: 2022/07/11/5:13
 * @Description: 在人间已是癫，何苦要上青天，不如温柔同眠
 */
//如果你享受国务院特殊津贴，那么按照规定，可以全部免税：
public class StateCouncilSpecialAllowance extends Income{
    //无参构造
    public StateCouncilSpecialAllowance() {
    }

    //有参构造
    public StateCouncilSpecialAllowance(double income) {
        super(income);
    }

    @Override
    public double getTax(){
        //StateCouncilSpecialAllowance类型的工资0税收
        return 0;
    }
}
