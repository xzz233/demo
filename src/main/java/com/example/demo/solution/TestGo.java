package com.example.demo.solution;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)

public class TestGo {
   @org.junit.Test
 public void solve(){
    int []a =new int[]{9,0,-1,1,6,10};
//    int []a =new int[]{9,0};
    int s=Solution.solve(a);
    System.out.println(s);
}

}
