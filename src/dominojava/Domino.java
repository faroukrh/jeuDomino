/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dominojava;

/**
 *
 * @author lenovoPro
 */
public class Domino {
int nbGauche, nbDroite;
    

        public Domino(int nbGauche, int nbDroite) {
            if (nbGauche >= 0 && nbGauche <= 6 && nbDroite >= 0 && nbDroite <= 6) {
                this.nbGauche = nbGauche;
                this.nbDroite = nbDroite;
            } else {
                throw new IllegalArgumentException("Valeurs entre 0 et 6");
            }
        }

        public int getNbGauche() {
            return nbGauche;
        }

        public int getNbDroit() {
            return nbDroite;
        }

        public void retourne() {
            int ancienNbDroite = nbDroite;
            nbDroite = nbGauche;
            nbGauche = ancienNbDroite;
        }

        public boolean peutSuivre(Domino autreDomino) {
            return (autreDomino.nbDroite == nbGauche);
        }

        public boolean peutPreceder(Domino autreDomino) {
            return (autreDomino.nbGauche == nbDroite);
        }

@Override
        public String toString() {
            return "(" + nbGauche + "," + nbDroite + ")";
        }

        public boolean equals(Domino autreDomino) {
    return nbGauche == autreDomino.nbGauche && nbDroite == autreDomino.nbDroite;

        }}
