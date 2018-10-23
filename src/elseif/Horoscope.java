package elseif;

import javax.swing.JOptionPane;

public class Horoscope {
 public static void main(String[] args) {
	String star = JOptionPane.showInputDialog("What is your star sign?");
	
	if (star.equals("leo")) {
	JOptionPane.showMessageDialog(null,"Your Horoscope:\n Leo tend to be honest and decent people,\n opting to do the right thing regardless of the situation.\n They love organization so that they can find their ‘things’.\n Leos love material goods and luxury and want those that\n they love to experience this wealth as well. Leo are generally\n accepting of everyone initially and make decent, lasting relationships.");
	}
	if (star.equals("aries")) {
	JOptionPane.showMessageDialog(null,"Your Horoscope:\n Highly energetic, and has no problem\n working long hours on a single project. Often take the \ninitiative experiencing new breakthroughs and discoveries. Aries are\n thorough, painstaking, and have a knack for precise records and clarity.\n They live hard, love hard, and play hard.");
	}
	if(star.equals("taurus")){
	JOptionPane.showMessageDialog(null,"Your Horoscope:\n Taurus people almost always finish what \nthey start. They are deliberate thinkers and when making \ndecisions usually make the right one. Taurus are generally\n adaptable, adjusting easily to new circumstances especially if there is\n the reward of luxury, comfort, or sensual reward. This sign loves to \nlaugh and spend time with family.");
	}
	if(star.equals("gemini")){
	JOptionPane.showMessageDialog(null,"Your Horoscope:\n Gemini are great conversationalists, and\n are charming people. Interesting to speak with, Gemini\n know a little bit about a lot of things. They have a great sense\n of humor and are generally optimistic people. Gemini often make \ntheir own fun, despising boredom.");
	}
	
	
	
	
	
	
	
	
	
	
	
}
}
