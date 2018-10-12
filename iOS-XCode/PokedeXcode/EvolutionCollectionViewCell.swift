//
//  EvolutionCollectionViewCell.swift
//  PokedeXcode
//
//  Created by Salomon BRYS on 12/10/2018.
//  Copyright © 2018 Kodein. All rights reserved.
//

import UIKit

class EvolutionCollectionViewCell: UICollectionViewCell {
    
    @IBOutlet weak var pokName: UILabel!
    @IBOutlet weak var pokImage: UIImageView!
    
    func bind(pokemon: Pokemon) {
        pokName.text = pokemon.name
        pokImage.kf.setImage(with: URL(string: pokemon.img))
    }
    
}
