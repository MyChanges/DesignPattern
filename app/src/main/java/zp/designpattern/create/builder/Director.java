package zp.designpattern.create.builder;

/**
 * Created by change on 2018/11/19.
 * 这个容易忽略
 *
 */

public class Director {
    Builder mBuilder = null;

    /**
     * @param builder
     */
    public Director(Builder builder) {
        mBuilder = builder;
    }

    /**
     * 构建对象
     *
     * @param cpu
     * @param ram
     * @param os
     */
    public void construct(int cpu, int ram, String os) {
        mBuilder.buildCPU(cpu);
        mBuilder.buildRAM(ram);
        mBuilder.buildOs(os);
    }

}
