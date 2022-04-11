package com.github.viqbgrg.onjava8.functional;

import org.junit.jupiter.api.Test;

import java.util.function.Predicate;

public class TaskUtil {
    public void run(String name, Predicate<Integer> predicate) {
        // 获取任务列表
        int taskKey = 1;
        if (predicate.test(taskKey)) {
            System.out.println(taskKey + " 执行成功");
        } else {
            System.out.println(taskKey + " 执行失败");
        }
    }

    boolean runTask(int id) {
        return true;
    }

    @Test
    void startTask() {
        Predicate<Integer> predicate = this::runTask;
        run("view",predicate);
    }
}
