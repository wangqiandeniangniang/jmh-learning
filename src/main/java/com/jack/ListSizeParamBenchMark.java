package com.jack;

import org.openjdk.jmh.annotations.*;
import org.openjdk.jmh.runner.Runner;
import org.openjdk.jmh.runner.RunnerException;
import org.openjdk.jmh.runner.options.Options;
import org.openjdk.jmh.runner.options.OptionsBuilder;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

/**
 * 不同初始长度创建集合速度如何
 * @author liangchen
 * @date 2021/6/11
 */
@State(Scope.Thread)
@BenchmarkMode(Mode.AverageTime)
@OutputTimeUnit(TimeUnit.NANOSECONDS)
@Fork(1)
@Measurement(iterations = 3, time =  1 )
@Warmup(iterations = 3, time = 1)
public class ListSizeParamBenchMark {

    @Param(value = {"12", "280", "5400"})
    private int param;
    @Benchmark
    public List  runArray(){
        return new ArrayList(param);
    }

    public static void main(String[] args) throws RunnerException {
        Options opt = new OptionsBuilder()
                .include(ListSizeParamBenchMark.class.getSimpleName())
                .build();

        new Runner(opt).run();
    }
}
