package controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.Bulbasaur;
import model.Charizard;
import model.Dragonite;
import model.Mew;
import model.Pikachu;

@WebServlet(urlPatterns = { "/pokemon" })
public class PokemonController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public PokemonController() {
		super();
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		RequestDispatcher rd = this.getServletContext().getRequestDispatcher("/WEB-INF/views/pokemon.jsp");
		rd.forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String value1 = request.getParameter("card1"); 
		String value2 = request.getParameter("card2"); 
		String value3 = request.getParameter("card3"); 
		String value4 = request.getParameter("card4"); 
		String value5 = request.getParameter("card5"); 

		String msg = "";
        String text="";
		
		if (value1 != null) {
			
 text ="Bulbasaur is a Grass/Poison-type Pokémon introduced in Generation I.It evolves into Ivysaur starting at level 16. It is one of the three Starter Pokémon in the Kanto region.";			
			
			Bulbasaur bulbasaur = new Bulbasaur("Bulbasaur",001,text,"POISON","IVYSAUR","64");
						
			msg = "<center>" + bulbasaur.getPokemonName() + "  #" + bulbasaur.getPokemonNumber();
			request.setAttribute("message1",bulbasaur.getPokemonNumber());	
		   	request.setAttribute("character2",bulbasaur.getCharacteristics()); 
			request.setAttribute("type2",bulbasaur.getType());
			request.setAttribute("evolution2", bulbasaur.getEvolution());
			request.setAttribute("baseExp2", bulbasaur.getBaseExp());
			 
		}

		if (value2 != null) {
			
		
text ="Charizard is fit and strong and has the ability to soar up to ridiculous heights.With a single breath of fire, it can burn down forests and melt gigantic glaciers.";		
			Charizard charizard = new Charizard("Charizard",006,text,"FIRE","CHARMELEON","240");
			
			
			msg = "<center>" + charizard.getPokemonName() + "  #" + charizard.getPokemonNumber();
			request.setAttribute("message1",charizard.getPokemonNumber());	
		   	request.setAttribute("character2",charizard.getCharacteristics()); 
			request.setAttribute("type2",charizard.getType());
			request.setAttribute("evolution2",charizard.getEvolution());
			request.setAttribute("baseExp2", charizard.getBaseExp());
			
		}

		if (value3 != null) {

	text="Dragonite is capable of flying faster than the speed of sound.It is a kindhearted Pokémon with human-like intelligence. It shows signs of altruism.";		
			
			Dragonite dragonite = new Dragonite("Dragonite",149,text,"DRAGON","DRATINI","270");
			
			
			msg = "<center>" +dragonite.getPokemonName() + "  #" + dragonite.getPokemonNumber();
			request.setAttribute("message1",dragonite.getPokemonNumber());	
		   	request.setAttribute("character2",dragonite.getCharacteristics()); 
			request.setAttribute("type2",dragonite.getType());
			request.setAttribute("evolution2",dragonite.getEvolution());
			request.setAttribute("baseExp2", dragonite.getBaseExp());
		
		}
		if (value4 != null) {

	text="Mew is a Psychic-type Mythical Pokémon introduced in Generation I.Mew is notable for its unique ability to learn every Technical Machine, Technical Record & Hidden Machine.";
			Mew mew = new Mew("MEW",151,text,"PSYCHIC","NONE","64");
			
			msg = "<center>" +mew.getPokemonName() + "  #" + mew.getPokemonNumber();
			request.setAttribute("message1",mew.getPokemonNumber());	
		   	request.setAttribute("character2",mew.getCharacteristics()); 
			request.setAttribute("type2",mew.getType());
			request.setAttribute("evolution2",mew.getEvolution());
			request.setAttribute("baseExp2", mew.getBaseExp());
		}

		if (value5 != null) {

 text=" Pikachu is an Electric-type Pokémon, which was introduced in Generation I.Over the years, Pikachu has become so popular that it serves as the Pokémon franchise mascot.";
	Pikachu pikachu = new Pikachu("Pikachu",25,text,"ELECTRIC","RAICHU","112");
			
			msg = "<center>" +pikachu.getPokemonName() + "  #" + pikachu.getPokemonNumber();
			request.setAttribute("message1",pikachu.getPokemonNumber());	
		   	request.setAttribute("character2",pikachu.getCharacteristics()); 
			request.setAttribute("type2",pikachu.getType());
			request.setAttribute("evolution2",pikachu.getEvolution());
			request.setAttribute("baseExp2", pikachu.getBaseExp());
	

		}

		RequestDispatcher rd = this.getServletContext().getRequestDispatcher("/WEB-INF/views/pokemon.jsp");
		rd.forward(request, response);

	}

}
