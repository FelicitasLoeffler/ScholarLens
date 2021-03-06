/**
 * ScholarLens - http://www.semanticsoftware.info/scholarlens
 *
 * This file is part of the ScholarLens component.
 *
 * Copyright (c) 2016, 2017, Semantic Software Lab, http://www.semanticsoftware.info,
 * Friedrich Schiller University Jena, http://fusion.cs.uni-jena.de
 *    Rene Witte
 *    Bahar Sateli
 *    Felicitas Loeffler
 *
 * This library is free software; you can redistribute it and/or
 * modify it under the terms of the GNU Lesser General Public
 * License as published by the Free Software Foundation; either
 * version 3.0 of the License, or (at your option) any later version.
 *
 * This library is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU
 * Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public
 * License along with this library.  If not, see <http://www.gnu.org/licenses/>.
 *
 **/

/**  
* @author Felicitas Loeffler
*
*/
public class Rating {
	int competenceRank;
	int rating;
	
	public Rating (int competenceRank, int rating){
		this.competenceRank=competenceRank;
		this.rating=rating;
	}

	public int getCompetenceRank() {
		return competenceRank;
	}

	public void setCompetenceRank(int competenceRank) {
		this.competenceRank = competenceRank;
	}

	public int getRating() {
		return rating;
	}

	public void setRating(int rating) {
		this.rating = rating;
	}
}
