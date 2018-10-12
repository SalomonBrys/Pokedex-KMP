//
//  AppDelegate.swift
//  PokedeXcode
//
//  Created by Salomon BRYS on 10/10/2018.
//  Copyright © 2018 Kodein. All rights reserved.
//

import UIKit

//import PKMPPokeBridge

@UIApplicationMain
class AppDelegate: UIResponder, UIApplicationDelegate {

    var window: UIWindow?

    let bridge: PokeBridge = PokeBridge()

    func application(_ application: UIApplication, didFinishLaunchingWithOptions launchOptions: [UIApplication.LaunchOptionsKey: Any]?) -> Bool {
        return true
    }

    func applicationWillResignActive(_ application: UIApplication) {}

    func applicationDidEnterBackground(_ application: UIApplication) {}

    func applicationWillEnterForeground(_ application: UIApplication) {}

    func applicationDidBecomeActive(_ application: UIApplication) {
    }

    func applicationWillTerminate(_ application: UIApplication) {}

}
