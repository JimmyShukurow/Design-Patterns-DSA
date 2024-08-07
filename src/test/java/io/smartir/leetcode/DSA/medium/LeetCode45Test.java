package io.smartir.leetcode.DSA.medium;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LeetCode45Test {

    @Test
    public void jump() {
        //given
        LeetCode45 test = new LeetCode45();
        int[] given = {2, 3, 1, 1, 4};
        //when
        var result = test.jump(given);
        //then
        assertThat(result).isEqualTo(2);
    }
    @Test
    public void jump2() {
        //given
        LeetCode45 test = new LeetCode45();
        int[] given = {2, 3, 0, 1, 4};
        //when
        var result = test.jump(given);
        //then
        assertThat(result).isEqualTo(2);
    }
    @Test
    public void jump3() {
        //given
        LeetCode45 test = new LeetCode45();
        int[] given = {1, 1, 1, 1, 4};
        //when
        var result = test.jump(given);
        //then
        assertThat(result).isEqualTo(4);
    }
    @Test
    public void jump4() {
        //given
        LeetCode45 test = new LeetCode45();
        int[] given = {3, 1, 1, 2, 4,9,6,3,7};
        //when
        var result = test.jump(given);
        //then
        assertThat(result).isEqualTo(3);
    }
    @Test
    public void jump5() {
        //given
        LeetCode45 test = new LeetCode45();
        int[] given = {2,3,1};
        //when
        var result = test.jump(given);
        //then
        assertThat(result).isEqualTo(1);
    }
    @Test
    public void jump6() {
        //given
        LeetCode45 test = new LeetCode45();
        int[] given = {3,4,3,2,5,4,3};
        //when
        var result = test.jump(given);
        //then
        assertThat(result).isEqualTo(3);
    }
    @Test
    public void jump7() {
        //given
        LeetCode45 test = new LeetCode45();
        int[] given = {1,1,1,1};
        //when
        var result = test.jump(given);
        //then
        assertThat(result).isEqualTo(3);
    }  @Test
    public void jump8() {
        //given
        LeetCode45 test = new LeetCode45();
        int[] given = {5,9,3,2,1,0,2,3,3,1,0,0};
        //when
        var result = test.jump(given);
        //then
        assertThat(result).isEqualTo(3);
    }
}