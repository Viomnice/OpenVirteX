package net.onrc.openvirtex.core;


public class OpenVirtexShutdownHook extends Thread {
    
    private OpenVirteXController ctrl;

    public OpenVirtexShutdownHook(OpenVirteXController ctrl) {
	this.ctrl = ctrl;
    }
    
    public void run() {
	this.ctrl.terminate();
    }
}
