package elseif;

import javax.swing.JOptionPane;

public class Horoscope {
	public static void main(String[] args) {
		String star = JOptionPane.showInputDialog("What is your star sign?");

		if (star.equals("leo")) {
			JOptionPane.showMessageDialog(null,
					"Your Horoscope:\n Leo tend to be honest and decent people,\n opting to do the right thing regardless of the situation.\n They love organization so that they can find their ‘things’.\n Leos love material goods and luxury and want those that\n they love to experience this wealth as well. Leo are generally\n accepting of everyone initially and make decent, lasting relationships.");
		}
		else if (star.equals("aries")) {
			JOptionPane.showMessageDialog(null,
					"Your Horoscope:\n Highly energetic, and has no problem\n working long hours on a single project. Often take the \ninitiative experiencing new breakthroughs and discoveries. Aries are\n thorough, painstaking, and have a knack for precise records and clarity.\n They live hard, love hard, and play hard.");
		}
		else if (star.equals("taurus")) {
			JOptionPane.showMessageDialog(null,
					"Your Horoscope:\n Taurus people almost always finish what \nthey start. They are deliberate thinkers and when making \ndecisions usually make the right one. Taurus are generally\n adaptable, adjusting easily to new circumstances especially if there is\n the reward of luxury, comfort, or sensual reward. This sign loves to \nlaugh and spend time with family.");
		}
		else if (star.equals("gemini")) {
			JOptionPane.showMessageDialog(null,
					"Your Horoscope:\n Gemini are great conversationalists, and\n are charming people. Interesting to speak with, Gemini\n know a little bit about a lot of things. They have a great sense\n of humor and are generally optimistic people. Gemini often make \ntheir own fun, despising boredom.");
		}
		else if (star.equals("cancer")) {
			JOptionPane.showMessageDialog(null,
					"Your Horoscope:\n Cancer have an offbeat sense of humor, often\n finding something humorous that others don’t. They are\n extremely good listeners and have a heart for the problems \nof others. In fact, many gravitate toward this sign because they \nintuitively know that a Cancer will understand. ");
		}
		else if (star.equals("virgo")) {
			JOptionPane.showMessageDialog(null,
					"Your Horoscope:\n Virgo have a heart for their fellow man. \nThey are kind, patient and love to laugh. They are not loud\n ‘look at me’ signs, but rather prefer to be the strong, \nsilent type. They are creative thinkers and true family oriented \npeople. Male Virgo, once they are committed to relationship\n never walk away. Female Virgo are dedicated\n parents, often parenting other children in the \nneighborhood.");
		}
		else if (star.equals("libra")) {
			JOptionPane.showMessageDialog(null,
					"Your Horoscope:\n Libra all have a sense of fair play about\n them and become completely upset if they perceive that\n something is unfair or unjust. They are prone to talking for\n long periods of time about their favorite subjects. Generally the\n decisions that a Libra makes are the ones that will benefit\n the most people. Libra are often self-sacrificing\n for the good of the team or the family.");
		}
		else if (star.equals("scorpio")) {
			JOptionPane.showMessageDialog(null,
					"Your Horoscope:\n Scorpio exhibit extreme self-control in many\n areas, and as a result expect that of those around them.\n They are disciplined, protective and are very interested \nin others. They give of themselves but do expect the same in \nreturn. Scorpio males and females both need to be the leaders,\n and excel at problem solving and troubleshooting \nprojects and situations.");
		}
		else if (star.equals("sagittarius")) {
			JOptionPane.showMessageDialog(null,
					"Your Horoscope:\n  Sagittarians are highly intelligent and love\n to be around intelligent people. They enjoy learning\n new things, traveling to new places, and experiencing unique\n adventures. Creativity is at the core of who they are and\n Sagittarians are often creating and recreating their living\n situations, work situations, and human relationships. ");
		}
		else if (star.equals("capricorn")) {
			JOptionPane.showMessageDialog(null,
					"Your Horoscope:\n Capricorns are the superheroes when It comes \nto making realistic, logical decisions. Their ability\n to cut through the red tape and see the bottom line is what makes\n them a real asset to any relationship or occupation where\n teamwork is valued. Capricorn are family oriented, but will \nkeep their distance if the family is perceived to\n be violent, harmful, or unfulfilling.");
		}
		else if (star.equals("aquarius")) {
			JOptionPane.showMessageDialog(null,
					"Your Horoscope:\n Aquarians are among the friendliest of the signs,\n making friends everywhere. They are often chosen \namong co-workers and family for special awards and honors because\n of their ability to network. Highly intelligent they are \nenergetic and talented, often using their abilities to help\n others. Despite their extensive people skills, they\n often crave alone time to reflect and think\n about things.");
		}
		else if (star.equals("pisces")) {
			JOptionPane.showMessageDialog(null,
					"Your Horoscope:\n Pisces are empathetic people, often feeling badly\n for someone whose life is not going well. They \nfeel the need to reach out to those who are less fortunate and\n will often find themselves involved in drama that they hadn’t\n intended. They are kind, caring individuals who feel everything\n deeply, even though you would not know it on the surface.");
		}
		else {
			JOptionPane.showMessageDialog(null, "Thats not a star sign!");
		}

	}
}
