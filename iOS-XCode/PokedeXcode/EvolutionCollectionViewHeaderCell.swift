//
//  EvolutionHeaderCollectionViewCell.swift
//  PokedeXcode
//
//  Created by Salomon BRYS on 12/10/2018.
//  Copyright © 2018 Kodein. All rights reserved.
//

import UIKit

class EvolutionCollectionViewHeaderCell: UICollectionViewCell {

    @IBOutlet weak var title: UILabel!
 
    func bind(dir: Direction) {
        title.text = dir.rawValue + ":"
    }
}
