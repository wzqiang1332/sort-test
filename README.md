- 其中test1为一条鱼的原版，test2为把List<Integer>改为int[]的
- 环境JDK 1.8.0_131，系统win10
- 测试结果如下
```
Benchmark            Mode  Cnt     Score     Error  Units
SortBenchmark.test1  avgt   10  5202.647 ± 176.064  ms/op
SortBenchmark.test2  avgt   10  1612.173 ±  45.953  ms/op
```
 - 详细记录
```
# JMH version: 1.34
# VM version: JDK 1.8.0_131, Java HotSpot(TM) 64-Bit Server VM, 25.131-b11
# VM invoker: C:\Program Files\Java\jdk1.8.0_131\jre\bin\java.exe
# VM options: -javaagent:C:\Program Files\JetBrains\ideaIU-2021.3.win\lib\idea_rt.jar=55862:C:\Program Files\JetBrains\ideaIU-2021.3.win\bin -Dfile.encoding=UTF-8
# Blackhole mode: full + dont-inline hint (auto-detected, use -Djmh.blackhole.autoDetect=false to disable)
# Warmup: 10 iterations, 10 s each
# Measurement: 10 iterations, 10 s each
# Timeout: 10 min per iteration
# Threads: 1 thread, will synchronize iterations
# Benchmark mode: Average time, time/op
# Benchmark: com.wzq.SortBenchmark.test1

# Run progress: 0.00% complete, ETA 00:06:40
# Fork: 1 of 1
# Warmup Iteration   1: 198302620
198302620
8827.155 ms/op
# Warmup Iteration   2: 198302620
198302620
5904.415 ms/op
# Warmup Iteration   3: 198302620
198302620
5266.045 ms/op
# Warmup Iteration   4: 198302620
198302620
5359.825 ms/op
# Warmup Iteration   5: 198302620
198302620
5291.735 ms/op
# Warmup Iteration   6: 198302620
198302620
198302620
4958.663 ms/op
# Warmup Iteration   7: 198302620
198302620
5172.158 ms/op
# Warmup Iteration   8: 198302620
198302620
5148.114 ms/op
# Warmup Iteration   9: 198302620
198302620
5175.178 ms/op
# Warmup Iteration  10: 198302620
198302620
5046.952 ms/op
Iteration   1: 198302620
198302620
5296.834 ms/op
Iteration   2: 198302620
198302620
5324.961 ms/op
Iteration   3: 198302620
198302620
5152.257 ms/op
Iteration   4: 198302620
198302620
5238.207 ms/op
Iteration   5: 198302620
198302620
5207.204 ms/op
Iteration   6: 198302620
198302620
5196.556 ms/op
Iteration   7: 198302620
198302620
5340.509 ms/op
Iteration   8: 198302620
198302620
5165.176 ms/op
Iteration   9: 198302620
198302620
198302620
4932.395 ms/op
Iteration  10: 198302620
198302620
5172.369 ms/op


Result "com.wzq.SortBenchmark.test1":
5202.647 ±(99.9%) 176.064 ms/op [Average]
(min, avg, max) = (4932.395, 5202.647, 5340.509), stdev = 116.455
CI (99.9%): [5026.583, 5378.710] (assumes normal distribution)


# JMH version: 1.34
# VM version: JDK 1.8.0_131, Java HotSpot(TM) 64-Bit Server VM, 25.131-b11
# VM invoker: C:\Program Files\Java\jdk1.8.0_131\jre\bin\java.exe
# VM options: -javaagent:C:\Program Files\JetBrains\ideaIU-2021.3.win\lib\idea_rt.jar=55862:C:\Program Files\JetBrains\ideaIU-2021.3.win\bin -Dfile.encoding=UTF-8
# Blackhole mode: full + dont-inline hint (auto-detected, use -Djmh.blackhole.autoDetect=false to disable)
# Warmup: 10 iterations, 10 s each
# Measurement: 10 iterations, 10 s each
# Timeout: 10 min per iteration
# Threads: 1 thread, will synchronize iterations
# Benchmark mode: Average time, time/op
# Benchmark: com.wzq.SortBenchmark.test2

# Run progress: 50.00% complete, ETA 00:03:47
# Fork: 1 of 1
# Warmup Iteration   1: 198302620
198302620
198302620
198302620
198302620
198302620
1699.282 ms/op
# Warmup Iteration   2: 198302620
198302620
198302620
198302620
198302620
198302620
198302620
1660.122 ms/op
# Warmup Iteration   3: 198302620
198302620
198302620
198302620
198302620
198302620
198302620
1607.298 ms/op
# Warmup Iteration   4: 198302620
198302620
198302620
198302620
198302620
198302620
198302620
1653.209 ms/op
# Warmup Iteration   5: 198302620
198302620
198302620
198302620
198302620
198302620
1690.087 ms/op
# Warmup Iteration   6: 198302620
198302620
198302620
198302620
198302620
198302620
198302620
1617.328 ms/op
# Warmup Iteration   7: 198302620
198302620
198302620
198302620
198302620
198302620
198302620
1600.044 ms/op
# Warmup Iteration   8: 198302620
198302620
198302620
198302620
198302620
198302620
198302620
1651.383 ms/op
# Warmup Iteration   9: 198302620
198302620
198302620
198302620
198302620
198302620
198302620
1585.416 ms/op
# Warmup Iteration  10: 198302620
198302620
198302620
198302620
198302620
198302620
198302620
1591.974 ms/op
Iteration   1: 198302620
198302620
198302620
198302620
198302620
198302620
198302620
1634.003 ms/op
Iteration   2: 198302620
198302620
198302620
198302620
198302620
198302620
198302620
1587.049 ms/op
Iteration   3: 198302620
198302620
198302620
198302620
198302620
198302620
198302620
1627.106 ms/op
Iteration   4: 198302620
198302620
198302620
198302620
198302620
198302620
198302620
1590.654 ms/op
Iteration   5: 198302620
198302620
198302620
198302620
198302620
198302620
198302620
1585.067 ms/op
Iteration   6: 198302620
198302620
198302620
198302620
198302620
198302620
198302620
1582.452 ms/op
Iteration   7: 198302620
198302620
198302620
198302620
198302620
198302620
1676.052 ms/op
Iteration   8: 198302620
198302620
198302620
198302620
198302620
198302620
198302620
1634.836 ms/op
Iteration   9: 198302620
198302620
198302620
198302620
198302620
198302620
198302620
1609.740 ms/op
Iteration  10: 198302620
198302620
198302620
198302620
198302620
198302620
198302620
1594.771 ms/op


Result "com.wzq.SortBenchmark.test2":
1612.173 ±(99.9%) 45.953 ms/op [Average]
(min, avg, max) = (1582.452, 1612.173, 1676.052), stdev = 30.395
CI (99.9%): [1566.220, 1658.126] (assumes normal distribution)


# Run complete. Total time: 00:07:30

REMEMBER: The numbers below are just data. To gain reusable insights, you need to follow up on
why the numbers are the way they are. Use profilers (see -prof, -lprof), design factorial
experiments, perform baseline and negative tests that provide experimental control, make sure
the benchmarking environment is safe on JVM/OS/HW level, ask for reviews from the domain experts.
Do not assume the numbers tell you what you want them to tell.

Benchmark            Mode  Cnt     Score     Error  Units
SortBenchmark.test1  avgt   10  5202.647 ± 176.064  ms/op
SortBenchmark.test2  avgt   10  1612.173 ±  45.953  ms/op
```