package cn.hassan;

import com.sun.tools.attach.VirtualMachine;

public class MyAttachMain {
    public static void main(String[] args) throws Exception {
        VirtualMachine vm = VirtualMachine.attach(args[0]);
        try {
            vm.loadAgent("/Users/hassan/go/opcode/my-attach-agent.jar");
        } finally {
            vm.detach();
        }
    }
}
