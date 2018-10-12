//
//  PokemonViewController.swift
//  PokedeXcode
//
//  Created by Salomon BRYS on 12/10/2018.
//  Copyright © 2018 Kodein. All rights reserved.
//

import UIKit
import Kingfisher

class PokemonViewController: UIViewController, PokemonMVPView {
    
    var pokemonId: Int32 = 0
    
    @IBOutlet weak var imageView: UIImageView!
    @IBOutlet weak var collectionView: UICollectionView!
    
    lazy var presenter = (UIApplication.shared.delegate as! AppDelegate).bridge.getPokemonPresenter(arg: PokemonMVP.Arg(view: self, pokemonId: pokemonId))

    lazy var dataSource = EvolutionCollectionViewDataSource(presenter)

    override func viewDidLoad() {
        super.viewDidLoad()

        collectionView.dataSource = dataSource
        collectionView.delegate = dataSource
        collectionView.allowsSelection = true
        collectionView.allowsMultipleSelection = false
        presenter.start()
    }
    
    override func viewWillAppear(_ animated: Bool) {
        let selected: IndexPath? = collectionView.indexPathsForSelectedItems?.first
        if (selected != nil) {
            collectionView.deselectItem(at: selected!, animated: true)
            dataSource.collectionView(collectionView, didDeselectItemAt: selected!)
        }
    }
    
    func displayPokemon(pokemon: Pokemon, evolutions: Evolutions) {
        imageView.kf.setImage(with: URL(string: pokemon.img))
        
        dataSource.evol = evolutions
        collectionView.reloadData()
    }
    
    func goToPokemonScreen(name: String, id: Int32) {
        performSegue(withIdentifier: "selectPokemon", sender: GoTo(id: id, name: name))
    }

    override func prepare(for segue: UIStoryboardSegue, sender: Any?) {
        if (segue.identifier == "selectPokemon") {
            let goTo = sender as! GoTo
            let destination = segue.destination as! PokemonViewController
            destination.pokemonId = goTo.id
            destination.title = goTo.name
        }
    }

    func close() {
        dismiss(animated: false, completion: nil)
    }

}
