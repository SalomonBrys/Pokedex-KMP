//
//  EvolutionCollectionViewDataSource.swift
//  PokedeXcode
//
//  Created by Salomon BRYS on 12/10/2018.
//  Copyright © 2018 Kodein. All rights reserved.
//

import UIKit

class EvolutionCollectionViewDataSource : NSObject, UICollectionViewDataSource, UICollectionViewDelegateFlowLayout {
    
    weak var presenter: PokemonMVPPresenter?
    
    var evol: Evolutions? = nil

    init(_ presenter: PokemonMVPPresenter) {
        self.presenter = presenter
    }
    
    func numberOfSections(in collectionView: UICollectionView) -> Int {
        return (evol?.prev.isNotEmpty ?? false ? 1 : 0) + (evol?.next.isNotEmpty ?? false ? 1 : 0)
    }
    
    func getEvolutions(for section: Int) -> [Pokemon] {
        if (section == 0 && evol!.prev.isNotEmpty) {
            return evol!.prev
        }
        return evol!.next
    }

    func getDirection(for section: Int) -> Direction {
        if (section == 0 && evol!.prev.isNotEmpty) {
            return .Prev
        }
        return .Next
    }

    func collectionView(_ collectionView: UICollectionView, numberOfItemsInSection section: Int) -> Int {
        return getEvolutions(for: section).count
    }
    
    func collectionView(_ collectionView: UICollectionView, cellForItemAt indexPath: IndexPath) -> UICollectionViewCell {
        let cell = collectionView.dequeueReusableCell(withReuseIdentifier: "EvolutionCell", for: indexPath) as! EvolutionCollectionViewCell
        let evolution = getEvolutions(for: indexPath.section)[indexPath.row]
        cell.bind(pokemon: evolution)
        return cell
    }
    
    func collectionView(_ collectionView: UICollectionView, layout collectionViewLayout: UICollectionViewLayout, sizeForItemAt indexPath: IndexPath) -> CGSize {
        let width = getEvolutions(for: indexPath.section)[indexPath.row].name.width(withConstrainedHeight: 60, font: UIFont.systemFont(ofSize: 17, weight: UIFont.Weight.regular))
        return CGSize(width: width + 20 + 60, height: 60)
    }
    
    func collectionView(_ collectionView: UICollectionView, viewForSupplementaryElementOfKind kind: String, at indexPath: IndexPath) -> UICollectionReusableView {
        let cell = collectionView.dequeueReusableSupplementaryView(ofKind: kind, withReuseIdentifier: "Header", for: indexPath) as! EvolutionCollectionViewHeaderCell
        cell.bind(dir: getDirection(for: indexPath.section))
        return cell
    }
    
    func collectionView(_ collectionView: UICollectionView, layout collectionViewLayout: UICollectionViewLayout, referenceSizeForHeaderInSection section: Int) -> CGSize {
        let width = getDirection(for: section).rawValue.width(withConstrainedHeight: 60, font: UIFont.systemFont(ofSize: 19, weight: UIFont.Weight.bold))
        return CGSize(width: width + 10, height: 60)
    }
    
    func collectionView(_ collectionView: UICollectionView, didHighlightItemAt indexPath: IndexPath) {
        let cell = collectionView.cellForItem(at: indexPath)!
        cell.contentView.backgroundColor = UIColor.lightGray
    }
    
    func collectionView(_ collectionView: UICollectionView, didUnhighlightItemAt indexPath: IndexPath) {
        let cell = collectionView.cellForItem(at: indexPath)!
        cell.contentView.backgroundColor = UIColor.clear
    }

    func collectionView(_ collectionView: UICollectionView, didSelectItemAt indexPath: IndexPath) {
        let cell = collectionView.cellForItem(at: indexPath)!
        cell.contentView.backgroundColor = UIColor.lightGray
        
        let evolution = getEvolutions(for: indexPath.section)[indexPath.row]
        presenter?.pokemonSelected(num: evolution.num)
    }

    func collectionView(_ collectionView: UICollectionView, didDeselectItemAt indexPath: IndexPath) {
        let cell = collectionView.cellForItem(at: indexPath)!
//        cell.contentView.backgroundColor = UIColor.clear
        
        UIView.animate(withDuration: 0.3, delay: 0.0, animations: {
            cell.contentView.backgroundColor = UIColor.clear
        }, completion:nil)
    }
}
