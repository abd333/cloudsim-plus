package org.cloudbus.cloudsim.schedulers.cloudlet;

import org.cloudbus.cloudsim.cloudlets.Cloudlet;
import org.cloudbus.cloudsim.cloudlets.CloudletExecutionInfo;
import org.cloudbus.cloudsim.schedulers.cloudlet.network.PacketScheduler;
import org.cloudbus.cloudsim.vms.Vm;

import java.util.Collections;
import java.util.List;

/**
 * A class that implements the Null Object Design Pattern for {@link CloudletScheduler}
 * class.
 *
 * @author Manoel Campos da Silva Filho
 * @see CloudletScheduler#NULL
 */
final class CloudletSchedulerNull implements CloudletScheduler {
    @Override
    public Cloudlet cloudletCancel(int cloudletId) {
        return Cloudlet.NULL;
    }

    @Override
    public void cloudletFinish(CloudletExecutionInfo rcl) {
    }

    @Override
    public boolean cloudletPause(int cloudletId) {
        return false;
    }

    @Override
    public double cloudletResume(int cloudletId) {
        return 0.0;
    }

    @Override
    public double cloudletSubmit(Cloudlet cl, double fileTransferTime) {
        return 0.0;
    }

    @Override
    public double cloudletSubmit(Cloudlet cl) {
        return 0.0;
    }

    @Override
    public List<CloudletExecutionInfo> getCloudletExecList() {
        return Collections.emptyList();
    }

    @Override
    public int getCloudletStatus(int cloudletId) {
        return 0;
    }

    @Override
    public List<Double> getCurrentMipsShare() {
        return Collections.emptyList();
    }

    @Override
    public List<Double> getCurrentRequestedMips() {
        return Collections.emptyList();
    }

    @Override
    public double getCurrentRequestedBwPercentUtilization() {
        return 0.0;
    }

    @Override
    public double getCurrentRequestedRamPercentUtilization() {
        return 0.0;
    }

    @Override
    public Cloudlet removeNextFinishedCloudlet() {
        return Cloudlet.NULL;
    }

    @Override
    public double getPreviousTime() {
        return 0.0;
    }

    @Override
    public double getAllocatedMipsForCloudlet(CloudletExecutionInfo rcl, double time) {
        return 0.0;
    }

    @Override
    public double getTotalCurrentAvailableMipsForCloudlet(CloudletExecutionInfo rcl, List<Double> mipsShare) {
        return 0.0;
    }

    @Override
    public double getRequestedMipsForCloudlet(CloudletExecutionInfo rcl, double time) {
        return 0.0;
    }

    @Override
    public double getRequestedCpuPercentUtilization(double time) {
        return 0.0;
    }

    @Override
    public boolean hasFinishedCloudlets() {
        return false;
    }

    @Override
    public PacketScheduler getPacketScheduler() {
        return PacketScheduler.NULL;
    }

    @Override
    public void setPacketScheduler(PacketScheduler packetScheduler) {
    }

    @Override
    public boolean isTherePacketScheduler() {
        return false;
    }

    @Override
    public Cloudlet getCloudletToMigrate() {
        return Cloudlet.NULL;
    }

    @Override
    public int runningCloudletsNumber() {
        return 0;
    }

    @Override
    public double updateVmProcessing(double currentTime, List<Double> mipsShare) {
        return 0.0;
    }

    @Override
    public Vm getVm() {
        return Vm.NULL;
    }

    @Override
    public void setVm(Vm vm) {
    }

    @Override
    public int getUsedPes() {
        return 0;
    }

    @Override
    public int getFreePes() {
        return 0;
    }

    @Override
    public boolean canAddCloudletToExecutionList(CloudletExecutionInfo cloudlet) {
        return false;
    }

    @Override
    public List<CloudletExecutionInfo> getCloudletFinishedList() {
        return Collections.emptyList();
    }

    @Override
    public List<CloudletExecutionInfo> getCloudletWaitingList() {
        return Collections.EMPTY_LIST;
    }
}
