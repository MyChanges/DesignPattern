package zp.designpattern.create.builder;

/**
 * Created by change on 2018/11/20.
 * 静态内部类方式构建(第二种方式)
 */

public class Window {
    private int mCpuCore = 1;
    private int mRamSize = 0;
    private String mOs = "Dos";

    public int getmCpuCore() {
        return mCpuCore;
    }

    public int getmRamSize() {
        return mRamSize;
    }

    public String getmOs() {
        return mOs;
    }

    public static class Builder {
        private Window window = new Window();

        public Builder setmCpuCore(int mCpuCore) {
            window.mCpuCore = mCpuCore;
            return this;
        }

        public Builder setmRamSize(int mRamSize) {
            window.mRamSize = mRamSize;
            return this;
        }

        public Builder setmOs(String mOs) {
            window.mOs = mOs;
            return this;
        }

        public Window create() {
            return window;
        }

    }

    @Override
    public String toString() {
        return "Window{" +
                "mCpuCore=" + mCpuCore +
                ", mRamSize=" + mRamSize +
                ", mOs='" + mOs + '\'' +
                '}';
    }
}
