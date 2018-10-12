//
//  ViewController.swift
//  PokedeXcode
//
//  Created by Salomon BRYS on 10/10/2018.
//  Copyright © 2018 Kodein. All rights reserved.
//

import UIKit

class PokemonListViewController: UITableViewController, PokemonListMVPView {

    lazy var presenter = (UIApplication.shared.delegate as! AppDelegate).bridge.getPokemonListPresenter(arg: PokemonListMVP.Arg(view: self))
   
    var pokemons = [Pokemon]()
    
    override func viewDidLoad() {
        super.viewDidLoad()
        
        presenter.start()
    }

    func displayList(pokemons: [Pokemon]) {
        self.pokemons = pokemons
        tableView.reloadData()
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

    override func numberOfSections(in tableView: UITableView) -> Int {
        return 1
    }
    
    override func tableView(_ tableView: UITableView, numberOfRowsInSection section: Int) -> Int {
        return pokemons.count
    }
    
    override func tableView(_ tableView: UITableView, cellForRowAt indexPath: IndexPath) -> UITableViewCell {
        let cell = tableView.dequeueReusableCell(withIdentifier: "PokemonCell") as! PokemonTableViewCell
        cell.bind(pokemons[indexPath.row])
        return cell
    }
    
    override func tableView(_ tableView: UITableView, didSelectRowAt indexPath: IndexPath) {
        let pokemon = pokemons[indexPath.row]
        
        presenter.pokemonSelected(id: pokemon.id)
    }

}

