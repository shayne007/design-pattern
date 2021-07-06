package designpattern.projectsInAction.wallet.controller;

import designpattern.projectsInAction.wallet.service.VirtualWalletService;

/**
 * controller 对外暴露接口，返回VO对象
 *
 * @author fengsy
 * @date 6/25/21
 * @Description
 */

public class VirtualWalletController {
    // 通过构造函数或者IOC框架注入
    private VirtualWalletService virtualWalletService;

}