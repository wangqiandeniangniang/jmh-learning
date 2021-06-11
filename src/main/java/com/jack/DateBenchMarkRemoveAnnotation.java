package com.jack;

import org.joda.time.DateTime;
import org.openjdk.jmh.annotations.*;
import org.openjdk.jmh.runner.Runner;
import org.openjdk.jmh.runner.RunnerException;
import org.openjdk.jmh.runner.options.Options;
import org.openjdk.jmh.runner.options.OptionsBuilder;
import org.openjdk.jmh.runner.options.TimeValue;

import java.util.Calendar;
import java.util.concurrent.TimeUnit;

/**
 * @author liangchen
 * @date 2021/6/11
 */
@State(Scope.Thread)
@BenchmarkMode(Mode.SingleShotTime)
@OutputTimeUnit(TimeUnit.NANOSECONDS)
public class DateBenchMarkRemoveAnnotation {

    @Benchmark
    public Calendar runCalendar(){
        return Calendar.getInstance();
    }

    @Benchmark
    public DateTime runJoda(){
        return new DateTime();
    }


    @Benchmark
    public long runSystem(){
        return System.currentTimeMillis();
    }

//    public static void main(String[] args) throws RunnerException {
//        Options opt = new OptionsBuilder()
//                .include(DateBenchMarkRemoveAnnotation.class.getSimpleName())
//                .forks(1)
//                .measurementIterations(3)
//                .measurementTime(TimeValue.seconds(1))
//                .warmupIterations(3)
//                .warmupTime(TimeValue.seconds(1))
//                .build();
//        new Runner(opt).run();
//    }
}
