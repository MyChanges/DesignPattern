package zp.designpattern.create.builder;

/**
 * Created by change on 2018/11/19.
 * builder抽象类
 */

public abstract class Builder {
    // 设置CPU核心数
    public abstract void buildCPU(int core);

    // 设置内存
    public abstract void buildRAM(int gb);

    // 设置操作系统
    public abstract void buildOs(String os);

    // 创建Computer
    public abstract Computer create();
}
