//
//  utils.swift
//  PokedeXcode
//
//  Created by Salomon BRYS on 12/10/2018.
//  Copyright © 2018 Kodein. All rights reserved.
//

import Foundation
import UIKit

public struct GoTo {
    public var id: Int32
    public var name: String
}

extension String
{
    func width(withConstrainedHeight height: CGFloat, font: UIFont) -> CGFloat
    {
        let constraintRect = CGSize(width: .greatestFiniteMagnitude, height: height);
        
        let boundingBox = self.boundingRect(with: constraintRect, options: .usesLineFragmentOrigin, attributes: [NSAttributedString.Key.font: font], context: nil)
        
        return boundingBox.width;
    }
}

extension Array {
    var isNotEmpty: Bool {
        get {
            return !isEmpty
        }
    }
}

enum Direction : String {
    case Prev = "Prev"
    case Next = "Next"
}
