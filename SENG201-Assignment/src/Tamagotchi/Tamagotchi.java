package Tamagotchi;
/**
 * 
 */
/**
 * @author Liguo Jiao
 * Student ID : 91734390
 * University Of Canterbury
 */


import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JButton;
import javax.swing.JDesktopPane;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.border.EmptyBorder;
import javax.swing.JComboBox;
import javax.swing.JRadioButton;
import javax.swing.SwingConstants;
public class Tamagotchi extends JFrame {
	private JPanel contentPane;
	private JTextField txtPet; private JTextField txtPet_1;	private JTextField txtPet_2;
	private JTextField txtPet_3; private JTextField txtPet_4; private JTextField txtPet_5;
	private JTextField txtPet_6; private JTextField txtPet_7; private JTextField txtPet_8;
	private ButtonGroup bg = new ButtonGroup();
	private static Integer days;
	private static Integer hungury; private static Integer hungury1; private static Integer hungury2;
	private static Integer hungury3; private static Integer hungury4; private static Integer hungury5;
	private static Integer hungury6; private static Integer hungury7; private static Integer hungury8;
	/**each hungury for each Pet, total is 9, it's start 0 to 8*/
	private static Integer mood; private static Integer mood1; private static Integer mood2;
	private static Integer mood3; private static Integer mood4; private static Integer mood5;
	private static Integer mood6; private static Integer mood7; private static Integer mood8;

	private static Integer tired; private static Integer tired1; private static Integer tired2;
	private static Integer tired3; private static Integer tired4; private static Integer tired5;
	private static Integer tired6; private static Integer tired7; private static Integer tired8;
	/**fatigue**/ 
	private static Integer pick; private static int num_food; private static int num_toy;
	/**
	 * Launch the application.
	 */
	Pet somePet1 = new Pet("Venusaur");	Pet somePet2 = new Pet("Charmander"); Pet somePet3 = new Pet("Charizard");
	Pet somePet4 = new Pet("Mankey");	Pet somePet5 = new Pet("Raichu");	Pet somePet6 = new Pet("Marowak");
	Pet somePet7 = new Pet("Clefairy"); Pet somePet8 = new Pet("Gengar");	Pet somePet9 = new Pet("Pikachu");
	
	Food someR = new Food("Red Bull"); Toys someM = new Toys("Motorbike");
	Food somePizza = new Food("Pizza");	Toys someP = new Toys("Puppet");
	Food somePasta = new Food("Pasta");	Toys someRB = new Toys("Rugby ball");

	private JTextField txtDays;	private JTextField txtData;	private JTextField textHealth;
	private JTextField textMood; private JTextField textTired; private JTextField textDisplayT;
	private JTextField textDisplayF;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Tamagotchi frame = new Tamagotchi();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	/**
	 * Create the frame.
	 */
	public Tamagotchi() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 920, 600);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		JButton btnFeedPet = new JButton("Feed Pet");
		btnFeedPet.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if ((hungury <= 5000)&&(pick == 1)){   /** Here detect that if the pet is hungry or not, total is 5000, pick is for which radio button is picked**/
					txtPet.setText("finish feed");    
					hungury += num_food;   /** so different food has different food number value to feed the pet*/
					txtData.setText(hungury.toString());  /**shows current hungry number value*/
					if ((hungury < 4000) && (tired < 5)){ /**check whether is sick or not*/
						textHealth.setText("Sick");
					}
					if ((hungury >= 4000) && (tired > 5)){
						textHealth.setText("Health");
					}
					Thread t = new Thread() {   /**make that window syntax flash, shows finish finish feed and will return to the original name*/
						public void run() {
							try {
								Thread.sleep(1000);
							} catch (InterruptedException e) {
								// TODO Auto-generated catch block
								e.printStackTrace();
							}
							txtPet.setText(somePet1.getName());
						}
					};
					t.start();
				}
				if (hungury >= 6000){  	/**some of the food has a huge number value, because of the maximum is 5000, so anything up to 5000 it's 5000.*/
					hungury = 5000;	txtData.setText(hungury.toString());
					txtPet.setText(somePet1.getName()+' '+'('+"Full"+')');
				}
				if ((hungury1 <= 5000)&&(pick == 2)){  /** same as above, but hungury1 is testing that second pet of player1*/
					txtPet_1.setText("finish feed");
					hungury1 += num_food; 
					txtData.setText(hungury1.toString());
					if ((hungury1 < 4000) && (tired1 < 7)){
						textHealth.setText("Sick");
					}
					if ((hungury1 >= 4000) && (tired1 > 7)){
						textHealth.setText("Health");
					}
					Thread t = new Thread() {
						public void run() {
							try {
								Thread.sleep(1000);
							} catch (InterruptedException e) {
								// TODO Auto-generated catch block
								e.printStackTrace();
							}
							txtPet_1.setText(somePet2.getName());
						}
					};
					t.start();
				}
				if (hungury1 >= 6000){
					hungury1 = 5000; txtData.setText(hungury1.toString());
					txtPet_1.setText(somePet2.getName()+' '+'('+"Full"+')');
				}			
				if ((hungury2 <= 5000) && (pick == 3)){
					txtPet_2.setText("finish feed");
					hungury2 += num_food;
					txtData.setText(hungury2.toString());
					if ((hungury2 < 4000) && (tired2 < 7)){
						textHealth.setText("Sick");
					}
					if ((hungury2 >= 4000) && (tired2 > 7)){
						textHealth.setText("Health");
					}
					Thread t = new Thread() {
						public void run() {
							try {
								Thread.sleep(1000);
							} catch (InterruptedException e) {
								// TODO Auto-generated catch block
								e.printStackTrace();
							}
							txtPet_2.setText(somePet3.getName());
						}
					};
					t.start();
				}
				if (hungury2 >= 6000){
					hungury2 = 5000; txtData.setText(hungury2.toString());
					txtPet_2.setText(somePet3.getName()+' '+'('+"Full"+')');
				}				
				if ((hungury3 <= 5000)&&(pick == 4)){
					txtPet_3.setText("finish feed");
					hungury3 += num_food;
					txtData.setText(hungury3.toString());
					if ((hungury3 < 4000) && (tired3 < 7)){
						textHealth.setText("Sick");
					}
					if ((hungury3 >= 4000) && (tired3 > 7)){
						textHealth.setText("Health");
					}
					Thread t = new Thread() {
						public void run() {
							try {
								Thread.sleep(1000);
							} catch (InterruptedException e) {
								// TODO Auto-generated catch block
								e.printStackTrace();
							}
							txtPet_3.setText(somePet4.getName());
						}
					};
					t.start();
				}
				if (hungury3 >= 6000){
					hungury3 = 5000; txtData.setText(hungury3.toString());
					txtPet_3.setText(somePet4.getName()+' '+'('+"Full"+')');
				}
				if ((hungury4 <= 5000)&&(pick == 5)){
					txtPet_4.setText("finish feed");
					hungury4 += num_food;
					txtData.setText(hungury4.toString());
					if ((hungury4 < 4000) && (tired4 < 7)){
						textHealth.setText("Sick");
					}
					if ((hungury4 >= 4000) && (tired4 > 7)){
						textHealth.setText("Health");
					}
					Thread t = new Thread() {
						public void run() {
							try {
								Thread.sleep(1000);
							} catch (InterruptedException e) {
								// TODO Auto-generated catch block
								e.printStackTrace();
							}
							txtPet_4.setText(somePet5.getName());
						}
					};
					t.start();
				}
				if (hungury4 >= 6000){
					hungury4 = 5000; txtData.setText(hungury4.toString());
					txtPet_4.setText(somePet5.getName()+' '+'('+"Full"+')');
				}
				if ((hungury5 <= 5000)&&(pick == 6)){
					txtPet_5.setText("finish feed");
					hungury5 += num_food;
					txtData.setText(hungury5.toString());
					if ((hungury5 < 4000) && (tired5 < 7)){
						textHealth.setText("Sick");
					}
					if ((hungury5 >= 4000) && (tired5 > 7)){
						textHealth.setText("Health");
					}
					Thread t = new Thread() {
						public void run() {
							try {
								Thread.sleep(1000);
							} catch (InterruptedException e) {
								// TODO Auto-generated catch block
								e.printStackTrace();
							}
							txtPet_5.setText(somePet6.getName());
						}
					};
					t.start();
				}
				if (hungury5 >= 6000){
					hungury5 = 5000; txtData.setText(hungury5.toString());
					txtPet_5.setText(somePet6.getName()+' '+'('+"Full"+')');
				}
				if ((hungury6 <= 5000)&&(pick == 7)){
					txtPet_6.setText("finish feed");
					hungury6 += num_food;
					txtData.setText(hungury6.toString());
					if ((hungury6 < 4000) && (tired6 < 7)){
						textHealth.setText("Sick");
					}
					if ((hungury6 >= 4000) && (tired6 > 7)){
						textHealth.setText("Health");
					}
					Thread t = new Thread() {
						public void run() {
							try {
								Thread.sleep(1000);
							} catch (InterruptedException e) {
								// TODO Auto-generated catch block
								e.printStackTrace();
							}
							txtPet_6.setText(somePet7.getName());
						}
					};
					t.start();
				}
				if (hungury6 >= 6000){
					hungury6 = 5000; txtData.setText(hungury6.toString());
					txtPet_6.setText(somePet7.getName()+' '+'('+"Full"+')');
				}
				if ((hungury7 <= 5000)&&(pick == 8)){
					txtPet_7.setText("finish feed");
					hungury7 += num_food;
					txtData.setText(hungury7.toString());
					if ((hungury7 < 4000) && (tired7 < 7)){
						textHealth.setText("Sick");
					}
					if ((hungury7 >= 4000) && (tired7 > 7)){
						textHealth.setText("Health");
					}
					Thread t = new Thread() {
						public void run() {
							try {
								Thread.sleep(1000);
							} catch (InterruptedException e) {
								// TODO Auto-generated catch block
								e.printStackTrace();
							}
							txtPet_7.setText(somePet8.getName());
						}
					};
					t.start();
				}
				if (hungury7 >= 6000){
					hungury7 = 5000; txtData.setText(hungury7.toString());
					txtPet_7.setText(somePet8.getName()+' '+'('+"Full"+')');
				}
				if ((hungury8 <= 5000)&&(pick == 9)){
					txtPet_8.setText("finish feed");
					hungury8 += num_food;
					txtData.setText(hungury8.toString());
					if ((hungury8 < 4000) && (tired8 < 7)){
						textHealth.setText("Sick");
					}
					if ((hungury8 >= 4000) && (tired8 > 7)){
						textHealth.setText("Health");
					}
					Thread t = new Thread() {
						public void run() {
							try {
								Thread.sleep(1000);
							} catch (InterruptedException e) {
								// TODO Auto-generated catch block
								e.printStackTrace();
							}
							txtPet_8.setText(somePet9.getName());
						}
					};
					t.start();
				}
				if (hungury8 >= 6000){
					hungury8 = 5000; txtData.setText(hungury8.toString());
					txtPet_8.setText(somePet9.getName()+' '+'('+"Full"+')');
				}
			}
		});
		JButton btnPlayWithPet = new JButton("Play with Pet");
		btnPlayWithPet.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if ((pick == 1) && (mood <= 5000)){
					txtPet.setText("finish play");	
					mood += num_toy;
					textMood.setText(mood.toString());
					Thread t = new Thread() {
						public void run() {
							try {
								Thread.sleep(1000);
							} catch (InterruptedException e) {
								// TODO Auto-generated catch block
								e.printStackTrace();
							}
							txtPet.setText(somePet1.getName());
						}
					};
					t.start();
				}
				
				if (mood >= 6000){
					mood = 5000; textMood.setText(mood.toString());
					txtPet.setText(somePet1.getName()+' '+'('+"Happy"+')');
				}
				if ((pick == 2) && (mood1 <= 5000)){
					txtPet_1.setText("finish play");
					mood1 += num_toy;
					textMood.setText(mood1.toString());
					Thread t = new Thread() {
						public void run() {
							try {
								Thread.sleep(1000);
							} catch (InterruptedException e) {
								// TODO Auto-generated catch block
								e.printStackTrace();
							}
							txtPet_1.setText(somePet2.getName());
						}
					};
					t.start();
				}
				if (mood1 >= 6000){
					mood1 = 5000; textMood.setText(mood1.toString());
					txtPet_1.setText(somePet2.getName()+' '+'('+"Happy"+')');
				}
				if ((pick == 3) && (mood2 <= 5000)){
					txtPet_2.setText("finish play");
					mood2 += num_toy;
					textMood.setText(mood2.toString());			
					Thread t = new Thread() {
						public void run() {
							try {
								Thread.sleep(1000);
							} catch (InterruptedException e) {
								// TODO Auto-generated catch block
								e.printStackTrace();
							}
							txtPet_2.setText(somePet3.getName());
						}
					};
					t.start();
				}
				if (mood2 >= 6000){
					mood2 = 5000; textMood.setText(mood2.toString());	
					txtPet_2.setText(somePet3.getName()+' '+'('+"Happy"+')');
				}
				if ((pick == 4) && (mood3 <= 5000)){
					txtPet_3.setText("finish play");
					mood3 += num_toy;
					textMood.setText(mood3.toString());	
					Thread t = new Thread() {
						public void run() {
							try {
								Thread.sleep(1000);
							} catch (InterruptedException e) {
								// TODO Auto-generated catch block
								e.printStackTrace();
							}
							txtPet_3.setText(somePet4.getName());
						}
					};
					t.start();
				}
				if (mood3 >= 6000){
					mood3 = 5000; textMood.setText(mood3.toString());	
					txtPet_3.setText(somePet4.getName()+' '+'('+"Happy"+')');
				}
				if ((pick == 5) && (mood4 <= 5000)){
					txtPet_4.setText("finish play");
					mood4 += num_toy;
					textMood.setText(mood4.toString());	
					Thread t = new Thread() {
						public void run() {
							try {
								Thread.sleep(1000);
							} catch (InterruptedException e) {
								// TODO Auto-generated catch block
								e.printStackTrace();
							}
							txtPet_4.setText(somePet5.getName());
						}
					};
					t.start();
				}
				if (mood4 >= 6000){
					mood4 = 5000; textMood.setText(mood4.toString());	
					txtPet_4.setText(somePet5.getName()+' '+'('+"Happy"+')');
				}
				if ((pick == 6) && (mood5 <= 5000)){
					txtPet_5.setText("finish play");
					mood5 += num_toy;
					textMood.setText(mood5.toString());	
					Thread t = new Thread() {
						public void run() {
							try {
								Thread.sleep(1000);
							} catch (InterruptedException e) {
								// TODO Auto-generated catch block
								e.printStackTrace();
							}
							txtPet_5.setText(somePet6.getName());
						}
					};
					t.start();
				}
				if (mood5 >= 6000){
					mood5 = 5000; textMood.setText(mood5.toString());	
					txtPet_5.setText(somePet6.getName()+' '+'('+"Happy"+')');
				}

				if ((pick == 7) && (mood6 <= 5000)){
					txtPet_6.setText("finish play");
					mood6 += num_toy;
					textMood.setText(mood6.toString());	
					Thread t = new Thread() {
						public void run() {
							try {
								Thread.sleep(1000);
							} catch (InterruptedException e) {
								// TODO Auto-generated catch block
								e.printStackTrace();
							}
							txtPet_6.setText(somePet7.getName());
						}
					};
					t.start();
				}
				if (mood6 >= 6000){
					mood6 = 5000; textMood.setText(mood6.toString());	
					txtPet_6.setText(somePet7.getName()+' '+'('+"Happy"+')');
				}
				if ((pick == 8) && (mood7 <= 5000)){
					txtPet_7.setText("finish play");
					mood7 += num_toy;
					textMood.setText(mood7.toString());	
					Thread t = new Thread() {
						public void run() {
							try {
								Thread.sleep(1000);
							} catch (InterruptedException e) {
								// TODO Auto-generated catch block
								e.printStackTrace();
							}
							txtPet_7.setText(somePet8.getName());
						}
					};
					t.start();
				}
				if (mood7 >= 6000){
					mood7 = 5000; textMood.setText(mood7.toString());
					txtPet_7.setText(somePet8.getName()+' '+'('+"Happy"+')');
				}
				if ((pick == 9) && (mood8 <= 5000)){
					txtPet_8.setText("finish play");
					mood8 += num_toy;
					textMood.setText(mood8.toString());	
					Thread t = new Thread() {
						public void run() {
							try {
								Thread.sleep(1000);
							} catch (InterruptedException e) {
								// TODO Auto-generated catch block
								e.printStackTrace();
							}
							txtPet_8.setText(somePet9.getName());
						}
					};
					t.start();
				}
				if (mood8 >= 6000){
					mood8 = 5000; textMood.setText(mood8.toString());	
					txtPet_8.setText(somePet9.getName()+' '+'('+"Happy"+')');
				}
			}
		});
		JButton btnPutPetTo = new JButton("Put pet to sleep");
		btnPutPetTo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if (pick == 1){
					tired = 10;
					txtPet.setText("sleepin");
					textTired.setText(tired.toString());
					if ((hungury < 4000) && (tired < 5)){
						textHealth.setText("Sick");
					}
					if ((hungury >= 4000) && (tired > 5)){
						textHealth.setText("Health");
					}
					Thread t = new Thread() {
						public void run() {
							try {
								Thread.sleep(1000);
							} catch (InterruptedException e){
								// TODO Auto-generated catch block
								e.printStackTrace();
							}
							txtPet.setText(somePet1.getName()+' '+'('+'S'+')');
							textTired.setText(tired.toString());
						}
					};
					t.start();
			    }
				if (pick == 2){
					tired1=10;
					txtPet_1.setText("sleepin");
					textTired.setText(tired1.toString());
					if ((hungury1 < 4000) && (tired1 < 7)){
						textHealth.setText("Sick");
					}
					if ((hungury1 >= 4000) && (tired1 > 7)){
						textHealth.setText("Health");
					}
					Thread t = new Thread() {
						public void run() {
							try {
								Thread.sleep(1000);
							} catch (InterruptedException e){
								// TODO Auto-generated catch block
								e.printStackTrace();
							}
							txtPet_1.setText(somePet2.getName()+' '+'('+'S'+')');
							textTired.setText(tired1.toString());
						}
					};
					t.start();
			    }
				if (pick == 3){
					tired2 = 10;
					txtPet_2.setText("sleepin");
					textTired.setText(tired2.toString());
					if ((hungury2 < 4000) && (tired2 < 7)){
						textHealth.setText("Sick");
					}
					if ((hungury2 >= 4000) && (tired2 > 7)){
						textHealth.setText("Health");
					}
					Thread t = new Thread() {
						public void run() {
							try {
								Thread.sleep(1000);
							} catch (InterruptedException e){
								// TODO Auto-generated catch block
								e.printStackTrace();
							}
							txtPet_2.setText(somePet3.getName()+' '+'('+'S'+')');
							textTired.setText(tired2.toString());
						}
					};
					t.start();
			    }
				if (pick == 4){
					tired3 = 10;
					txtPet_3.setText("sleepin");
					textTired.setText(tired3.toString());
					if ((hungury3 < 4000) && (tired3 < 7)){
						textHealth.setText("Sick");
					}
					if ((hungury3 >= 4000) && (tired3 > 7)){
						textHealth.setText("Health");
					}
					Thread t = new Thread() {
						public void run() {
							try {
								Thread.sleep(1000);
							} catch (InterruptedException e){
								// TODO Auto-generated catch block
								e.printStackTrace();
							}
							txtPet_3.setText(somePet4.getName()+' '+'('+'S'+')');
							textTired.setText(tired3.toString());
						}
					};
					t.start();
			    }
				if (pick == 5){
					tired4 = 10;
					txtPet_4.setText("sleepin");
					textTired.setText(tired4.toString());
					if ((hungury4 < 4000) && (tired4 < 7)){
						textHealth.setText("Sick");
					}
					if ((hungury4 >= 4000) && (tired4 > 7)){
						textHealth.setText("Health");
					}
					Thread t = new Thread() {
						public void run() {
							try {
								Thread.sleep(1000);
							} catch (InterruptedException e){
								// TODO Auto-generated catch block
								e.printStackTrace();
							}
							txtPet_4.setText(somePet5.getName()+' '+'('+'S'+')');
							textTired.setText(tired4.toString());
						}
					};
					t.start();
			    }
				if (pick == 6){
					tired5 = 10;
					txtPet_5.setText("sleepin");
					textTired.setText(tired5.toString());
					if ((hungury5 < 4000) && (tired5 < 7)){
						textHealth.setText("Sick");
					}
					if ((hungury5 >= 4000) && (tired5 > 7)){
						textHealth.setText("Health");
					}
					Thread t = new Thread() {
						public void run() {
							try {
								Thread.sleep(1000);
							} catch (InterruptedException e){
								// TODO Auto-generated catch block
								e.printStackTrace();
							}
							txtPet_5.setText(somePet6.getName()+' '+'('+'S'+')');
							textTired.setText(tired5.toString());
						}
					};
					t.start();
			    }
				if (pick == 7){
					tired6 = 10;
					txtPet_6.setText("sleepin");
					textTired.setText(tired6.toString());
					if ((hungury6 < 4000) && (tired6 < 7)){
						textHealth.setText("Sick");
					}
					if ((hungury6 >= 4000) && (tired6 > 7)){
						textHealth.setText("Health");
					}
					Thread t = new Thread() {
						public void run() {
							try {
								Thread.sleep(1000);
							} catch (InterruptedException e){
								// TODO Auto-generated catch block
								e.printStackTrace();
							}
							txtPet_6.setText(somePet7.getName()+' '+'('+'S'+')');
							textTired.setText(tired6.toString());
						}
					};
					t.start();
			    }
				if (pick == 8){
					tired7 = 10;
					txtPet_7.setText("sleepin");
					textTired.setText(tired7.toString());
					if ((hungury7 < 4000) && (tired7 < 7)){
						textHealth.setText("Sick");
					}
					if ((hungury7 >= 4000) && (tired7 > 7)){
						textHealth.setText("Health");
					}
					Thread t = new Thread() {
						public void run() {
							try {
								Thread.sleep(1000);
							} catch (InterruptedException e){
								// TODO Auto-generated catch block
								e.printStackTrace();
							}
							txtPet_7.setText(somePet8.getName()+' '+'('+'S'+')');
							textTired.setText(tired7.toString());
						}
					};
					t.start();
			    }
				if (pick == 9){
					tired8 = 10;
					txtPet_8.setText("sleepin");
					textTired.setText(tired8.toString());
					if ((hungury8 < 4000) && (tired8 < 7)){
						textHealth.setText("Sick");
					}
					if ((hungury8 >= 4000) && (tired8 > 7)){
						textHealth.setText("Health");
					}
					Thread t = new Thread() {
						public void run() {
							try {
								Thread.sleep(1000);
							} catch (InterruptedException e){
								// TODO Auto-generated catch block
								e.printStackTrace();
							}
							txtPet_8.setText(somePet9.getName()+' '+'('+'S'+')');
							textTired.setText(tired8.toString());
						}
					};
					t.start();
			    }
			}
		});
		JButton btnLetPetLive = new JButton("Let pet live");
		btnLetPetLive.setVerticalAlignment(SwingConstants.BOTTOM);
		btnLetPetLive.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				days=0;
				hungury = 5000; hungury1 = 5000; hungury2 = 5000; /**setup the hungry, mood and tiredness start at 5000 for each pet*/
				hungury3 = 5000; hungury4 = 5000; hungury5 = 5000;
				hungury6 = 5000;hungury7 = 5000;hungury8 = 5000;
				txtData.setText(hungury.toString()); 
				mood = 5000; mood1 = 5000; mood2 = 5000; 
				mood3 = 5000; mood4 = 5000;	mood5 = 5000;
				mood6 = 5000; mood7 = 5000;	mood8 = 5000;
				textMood.setText(mood.toString());
				tired = 10; tired1 = 10; tired2 = 10;
				tired3 = 10; tired4 = 10; tired5 = 10;
				tired6 = 10; tired7 = 10; tired8 = 10;
				textTired.setText(tired.toString());
				textHealth.setText("Health");
			}
		});
		JDesktopPane desktopPane = new JDesktopPane();
			
		txtPet = new JTextField(); /**the window of first pet (fist of player1)*/
		txtPet.setText(somePet1.getName());
		txtPet.setBounds(37, 30, 92, 58);
		desktopPane.add(txtPet);
		txtPet.setColumns(10);
		
		txtPet_1 = new JTextField();
		txtPet_1.setText(somePet2.getName());
		txtPet_1.setColumns(10);
		txtPet_1.setBounds(37, 189, 92, 58);
		desktopPane.add(txtPet_1);
		
		txtPet_2 = new JTextField();
		txtPet_2.setText(somePet3.getName());
		txtPet_2.setColumns(10);
		txtPet_2.setBounds(37, 328, 92, 58);
		desktopPane.add(txtPet_2);
		
		JLabel lblPlayer = new JLabel("Player1");
		lblPlayer.setBounds(10, 5, 54, 15);
		desktopPane.add(lblPlayer);
		
		JDesktopPane desktopPane_1 = new JDesktopPane();
		JDesktopPane desktopPane_2 = new JDesktopPane();
		
		JButton btnNextDay = new JButton("NEXT DAY");
		btnNextDay.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if (hungury != 0){
					days = days + 1;
					txtDays.setText(days.toString());
/** each day passed the hungry, and mood will reduce 1000, that tiredness will reduce 2(total is 10)*/
					hungury -= 1000; hungury1 -= 1000; hungury2 -= 1000;
					hungury3 -= 1000; hungury4 -= 1000; hungury5 -= 1000;
					hungury6 -= 1000; hungury7 -= 1000; hungury8 -= 1000;
/**this if statement just for sure if one of these pet has 0 hungry value but other didn't, this pet wont keep minus 1000 by passing the day */
					if (hungury <= 0){  
						hungury = 0;txtData.setText(hungury.toString());
					}
					if (hungury1 <= 0){
						hungury1 = 0;txtData.setText(hungury1.toString());
					}
					if (hungury2 <= 0){
						hungury2 = 0;txtData.setText(hungury2.toString());
					}
					if (hungury3 <= 0){
						hungury3 = 0;txtData.setText(hungury3.toString());
					}
					if (hungury4 <= 0){
						hungury4 = 0;txtData.setText(hungury4.toString());
					}
					if (hungury5 <= 0){
						hungury5 = 0;txtData.setText(hungury5.toString());
					}
					if (hungury6 <= 0){
						hungury6 = 0;txtData.setText(hungury6.toString());
					}
					if (hungury7 <= 0){
						hungury7 = 0;txtData.setText(hungury7.toString());
					}
					if (hungury8 <= 0){
						hungury8 = 0;txtData.setText(hungury8.toString());
					}
					mood -= 1000; mood1 -= 1000; mood2 -= 1000;
					mood3 -= 1000; mood4 -= 1000; mood5 -= 1000;
					mood6 -= 1000; mood7 -= 1000; mood8 -= 1000;
					if (mood8 <= 0){
						mood8 = 0;textMood.setText(mood8.toString());
					}
					if (mood <= 0){
						mood = 0;textMood.setText(mood.toString());
					}
					if (mood1 <= 0){
						mood1 = 0;textMood.setText(mood1.toString());
					}
					if (mood2 <= 0){
						mood2 = 0;textMood.setText(mood2.toString());
					}
					if (mood3 <= 0){
						mood3 = 0;textMood.setText(mood3.toString());
					}
					if (mood4 <= 0){
						mood4 = 0;textMood.setText(mood4.toString());
					}
					if (mood5 <= 0){
						mood5 = 0;textMood.setText(mood5.toString());
					}
					if (mood6 <= 0){
						mood6 = 0;textMood.setText(mood6.toString());
					}
					if (mood7 <= 0){
						mood7 = 0;textMood.setText(mood7.toString());
					}
					tired -= 2; tired1 -= 2; tired2 -= 2;
					tired3 -= 2; tired4 -= 2; tired5 -= 2;
					tired6 -= 2; tired7 -= 2; tired8 -= 2;
					txtData.setText(hungury.toString());
					textMood.setText(mood.toString());
					textTired.setText(tired.toString());
				}
/** If any one of the pet is 0 hungry value then when u click next day, it will shows DIE, this for tell player there has a pet die*/
				if (hungury == 0 || hungury1 == 0 || hungury2 == 0 || hungury3 == 0 || hungury4 == 0 || hungury5 == 0 || hungury6 == 0 || hungury7 == 0 || hungury8 == 0){
					txtData.setText("DIE!!!"); textMood.setText("DIE!!!");
					textHealth.setText("DIE!!!"); textTired.setText("DIE!!!");
				}
				if ((mood == 0) && (hungury != 0)){
					textMood.setText("Angry!!!");
				}/**If the pet not die just mood==0 then it's Angry*/
				if ((tired == 0) && (hungury != 0)){
					textTired.setText("Need nap");
				}
				if ((hungury < 4000) && (tired < 7)){
					textHealth.setText("Sick");
				}
				if ((hungury >= 4000) && (tired > 7)){
					textHealth.setText("Health");
				}
		    	txtPet.setText(somePet1.getName());	txtPet_1.setText(somePet2.getName()); txtPet_2.setText(somePet3.getName());
		    	txtPet_3.setText(somePet4.getName()); txtPet_4.setText(somePet5.getName()); txtPet_5.setText(somePet6.getName());
		    	txtPet_6.setText(somePet7.getName()); txtPet_7.setText(somePet8.getName()); txtPet_8.setText(somePet9.getName());
			}
		});
		
		JLabel lblPlayer_2 = new JLabel("Player 3");
		lblPlayer_2.setBounds(10, 10, 66, 15);
		desktopPane_2.add(lblPlayer_2);
		
		txtPet_6 = new JTextField();
		txtPet_6.setText(somePet7.getName());
		txtPet_6.setBounds(43, 35, 93, 56);
		desktopPane_2.add(txtPet_6);
		txtPet_6.setColumns(10);
		
		txtPet_7 = new JTextField();
		txtPet_7.setText(somePet8.getName());
		txtPet_7.setBounds(43, 179, 93, 56);
		desktopPane_2.add(txtPet_7);
		txtPet_7.setColumns(10);
		
		txtPet_8 = new JTextField();
		txtPet_8.setText(somePet9.getName());
		txtPet_8.setBounds(43, 328, 93, 55);
		desktopPane_2.add(txtPet_8);
		txtPet_8.setColumns(10);
		
		txtPet_3 = new JTextField();
		txtPet_3.setText(somePet4.getName());
		txtPet_3.setBounds(42, 32, 90, 56);
		desktopPane_1.add(txtPet_3);
		txtPet_3.setColumns(10);
		
		txtPet_4 = new JTextField();
		txtPet_4.setText(somePet5.getName());
		txtPet_4.setBounds(42, 183, 90, 56);
		desktopPane_1.add(txtPet_4);
		txtPet_4.setColumns(10);
		
		txtPet_5 = new JTextField();
		txtPet_5.setText(somePet6.getName());
		txtPet_5.setBounds(42, 328, 90, 57);
		desktopPane_1.add(txtPet_5);
		txtPet_5.setColumns(10);
		
		JLabel lblPlayer_1 = new JLabel("Player 2");
		lblPlayer_1.setBounds(10, 7, 71, 15);
		desktopPane_1.add(lblPlayer_1);
		
		txtDays = new JTextField();
		txtDays.setText("0");
		txtDays.setColumns(10);
		
		txtData = new JTextField();
		txtData.setColumns(10);
		
		JLabel lblHungry = new JLabel("Hungry: ");
						
		textHealth = new JTextField();
		textHealth.setColumns(10);
		
		JLabel lblFoodForFeed = new JLabel("Food for feed: ");		
		JLabel lblHealth = new JLabel("Health: ");
		JLabel lblToysForPlay = new JLabel("Toys for play: ");
		JLabel lblDays = new JLabel("Days:");
		
		final JComboBox<String> comboBox = new JComboBox<String>();
		comboBox.addItem("");
		comboBox.addItem(someRB.getName());
		comboBox.addItem(someP.getName());
		comboBox.addItem(someM.getName());
		comboBox.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if (comboBox.getSelectedItem().toString() == someM.getName()){
					num_toy = 3000; /**someM is motor bike, so if the pet rides motor bike it will got 3000 plus on mood */
				}
				if (comboBox.getSelectedItem().toString() == someP.getName()){
					num_toy = 1000;
				}
				if (comboBox.getSelectedItem().toString() == someRB.getName()){
					num_toy = 2000;
				}
				textDisplayT.setText(num_toy+"");/**Display the value of which toys you selected*/
			}
		});

		final JComboBox<String> comboBox_1 = new JComboBox<String>();
		comboBox_1.addItem("");
		comboBox_1.addItem(someR.getName());
		comboBox_1.addItem(somePasta.getName());
		comboBox_1.addItem(somePizza.getName());
		comboBox_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (comboBox_1.getSelectedItem().toString() == someR.getName()){
					num_food = 3000; /** someR means Red_bull, so if feed pet this, the hungry value of pet will got 3000 plus on*/
				}
				if (comboBox_1.getSelectedItem().toString() == somePizza.getName()){
					num_food = 1000;
				}
				if (comboBox_1.getSelectedItem().toString() == somePasta.getName()){
					num_food = 2000;
				}
				textDisplayF.setText(num_food+"");/**when u selected different food it will shows how many values it could feed the pet*/
			}
		});

		JLabel lblMood = new JLabel("Mood: ");
		textMood = new JTextField();
		textMood.setColumns(10);
		
		final JRadioButton radioButton_8 = new JRadioButton("");
		radioButton_8.setBounds(10, 347, 21, 21);
		desktopPane_2.add(radioButton_8);
		radioButton_8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			    if (radioButton_8.isSelected()){
					if (hungury8 == 0){ /**When you selected the pet if it had 0 hungry value which means it's die*/
						txtData.setText("DIE!!!"); textMood.setText("DIE!!!");
						textHealth.setText("DIE!!!"); textTired.setText("DIE!!!");
						pick = 10;/**if die just make the pick out of the list, so wont pick any pet anymore.*/
					}
					if (hungury8 != 0){
				    	pick = 9;/** make pick = 9 then the code above knows it's NO.9 selected then feed or play with NO.9*/
				    	txtData.setText(hungury8.toString()); textMood.setText(mood8.toString()); textTired.setText(tired8.toString()); 
					}
					if (mood8 == 0){
						textMood.setText("Angry!!!");
					}
					if ((hungury8 < 4000) && (tired8 < 7)){
						textHealth.setText("Sick");
					}
					if ((hungury8 >= 4000) && (tired8 > 7)){
						textHealth.setText("Health");
					}
			    }
			}
		});
		
		final JRadioButton radioButton_7 = new JRadioButton("");
		radioButton_7.setBounds(10, 193, 21, 21);
		desktopPane_2.add(radioButton_7);
		radioButton_7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			    if (radioButton_7.isSelected()){
					if (hungury7 == 0){
						txtData.setText("DIE!!!"); textMood.setText("DIE!!!");
						textHealth.setText("DIE!!!"); textTired.setText("DIE!!!");
						pick = 10;
					}
					if (hungury7 != 0){
						pick = 8;
						txtData.setText(hungury7.toString()); textMood.setText(mood7.toString()); textTired.setText(tired7.toString());
					}
					if (mood7 == 0){
						textMood.setText("Angry!!!");
					}
					if ((hungury7 < 4000) && (tired7 < 7)){
						textHealth.setText("Sick");
					}
					if ((hungury7 >= 4000) && (tired7 > 7)){
						textHealth.setText("Health");
					}
			    }
			}
		});
		final JRadioButton radioButton_6 = new JRadioButton("");
		radioButton_6.setBounds(10, 53, 21, 21);
		desktopPane_2.add(radioButton_6);
		radioButton_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			    if (radioButton_6.isSelected()){
					if (hungury6 == 0){
						txtData.setText("DIE!!!"); textMood.setText("DIE!!!");
						textHealth.setText("DIE!!!"); textTired.setText("DIE!!!");
						pick = 10;
					}
					if (hungury6 != 0){
						pick = 7;
						txtData.setText(hungury6.toString()); textMood.setText(mood6.toString()); textTired.setText(tired6.toString());
					}
					if (mood6 == 0){
						textMood.setText("Angry!!!");
					}
					if ((hungury6 < 4000) && (tired6 < 7)){
						textHealth.setText("Sick");
					}
					if ((hungury6 >= 4000) && (tired6 > 7)){
						textHealth.setText("Health");
					}
			    }
			}
		});
		final JRadioButton radioButton_1 = new JRadioButton("");
		radioButton_1.setBounds(10, 207, 21, 21);
		desktopPane.add(radioButton_1);
		radioButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			    if (radioButton_1.isSelected()){
					if (hungury1 == 0){
						txtData.setText("DIE!!!"); textMood.setText("DIE!!!");
						textHealth.setText("DIE!!!"); textTired.setText("DIE!!!");
						pick = 10;
					}
					if (hungury1 != 0){
				    	pick = 2;
				    	txtData.setText(hungury1.toString()); textMood.setText(mood1.toString()); textTired.setText(tired1.toString());
					}
					if (mood1 == 0){
						textMood.setText("Angry!!!");
					}
					if ((hungury1 < 4000) && (tired1 < 7)){
						textHealth.setText("Sick");
					}
					if ((hungury1 >= 4000) && (tired1 > 7)){
						textHealth.setText("Health");
					}
			    }
			}
		});
		final JRadioButton radioButton = new JRadioButton("");
		radioButton.setBounds(10, 47, 21, 23);
		desktopPane.add(radioButton);
		radioButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			    if (radioButton.isSelected()){
					if (hungury == 0){
						txtData.setText("DIE!!!"); textMood.setText("DIE!!!");
						textHealth.setText("DIE!!!"); textTired.setText("DIE!!!");
						pick = 10;
					}
					if (hungury != 0){
				    	pick = 1;
				    	txtData.setText(hungury.toString()); textMood.setText(mood.toString()); textTired.setText(tired.toString());
					}
					if (mood == 0){
						textMood.setText("Angry!!!");
					}
					if ((hungury < 4000) && (tired < 7)){
						textHealth.setText("Sick");
					}
					if ((hungury >= 4000) && (tired > 7)){
						textHealth.setText("Health");
					}
			    }
			}
		});
		final JRadioButton radioButton_2 = new JRadioButton("");
		radioButton_2.setBounds(10, 349, 21, 21);
		desktopPane.add(radioButton_2);
		radioButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			    if (radioButton_2.isSelected()){
					if (hungury2 == 0){
						txtData.setText("DIE!!!"); textMood.setText("DIE!!!");
						textHealth.setText("DIE!!!"); textTired.setText("DIE!!!");
						pick = 10;
					}
					if (hungury2 != 0){
						pick = 3;
						txtData.setText(hungury2.toString()); textMood.setText(mood2.toString()); textTired.setText(tired2.toString());

					}
					if (mood2 == 0){
						textMood.setText("Angry!!!");
					}
					if ((hungury2 < 4000) && (tired2 < 7)){
						textHealth.setText("Sick");
					}
					if ((hungury2 >= 4000) && (tired2 > 7)){
						textHealth.setText("Health");
					}
			    }
			    
			}
		});

		final JRadioButton radioButton_3 = new JRadioButton("");
		radioButton_3.setBounds(10, 52, 21, 21);
		desktopPane_1.add(radioButton_3);
		radioButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			    if (radioButton_3.isSelected()){
					if (hungury3 == 0){
						txtData.setText("DIE!!!"); textMood.setText("DIE!!!");
						textHealth.setText("DIE!!!"); textTired.setText("DIE!!!");
						pick = 10;
					}
					if (hungury3 != 0){
				    	pick = 4;
				    	txtData.setText(hungury3.toString()); textMood.setText(mood3.toString()); textTired.setText(tired3.toString());
			    	}
					if (mood3 == 0){
						textMood.setText("Angry!!!");
					}
					if ((hungury3 < 4000) && (tired3 < 7)){
						textHealth.setText("Sick");
					}
					if ((hungury3 >= 4000) && (tired3 > 7)){
						textHealth.setText("Health");
					}
			    }
			}
		});	
		final JRadioButton radioButton_4 = new JRadioButton("");
		radioButton_4.setBounds(15, 201, 21, 21);
		desktopPane_1.add(radioButton_4);
		radioButton_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			    if (radioButton_4.isSelected()){
					if (hungury4 == 0){
						txtData.setText("DIE!!!"); textMood.setText("DIE!!!");
						textHealth.setText("DIE!!!"); textTired.setText("DIE!!!");
						pick = 10;
					}
					if (hungury4 != 0){
						pick = 5;
						txtData.setText(hungury4.toString()); textMood.setText(mood4.toString()); textTired.setText(tired4.toString());
					}
					if (mood4 == 0){
						textMood.setText("Angry!!!");
					}
					if ((hungury4 < 4000) && (tired4 < 7)){
						textHealth.setText("Sick");
					}
					if ((hungury4 >= 4000) && (tired4 > 7)){
						textHealth.setText("Health");
					}
			    }
			}
		});
		
		final JRadioButton radioButton_5 = new JRadioButton("");
		radioButton_5.setBounds(15, 342, 21, 21);
		desktopPane_1.add(radioButton_5);
		radioButton_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			    if (radioButton_5.isSelected()){
					if (hungury5 == 0){
						txtData.setText("DIE!!!"); textMood.setText("DIE!!!");
						textHealth.setText("DIE!!!"); textTired.setText("DIE!!!");
						pick = 10;
					}
					if (hungury5 != 0){
						pick = 6;
						txtData.setText(hungury5.toString()); textMood.setText(mood5.toString()); textTired.setText(tired5.toString());
					}
					if (mood5 == 0){
						textMood.setText("Angry!!!");
					}
					if ((hungury5 < 4000) && (tired5 < 7)){
						textHealth.setText("Sick");
					}
					if ((hungury5 >= 4000) && (tired5 > 7)){
						textHealth.setText("Health");
					}
			    }	
			}
		});
		/**radio button box make sure only one radio button could be selected*/
		bg.add(radioButton_4); bg.add(radioButton_2); bg.add(radioButton);
		bg.add(radioButton_1); bg.add(radioButton_3); bg.add(radioButton_6);
		bg.add(radioButton_8); bg.add(radioButton_5); bg.add(radioButton_7);
		/**add a Jlaber for display*/
		JLabel lblFatigue = new JLabel("Fatigue:");
		textTired = new JTextField();
		textTired.setColumns(10);
		
		textDisplayT = new JTextField();
		textDisplayT.setText(num_toy+"");
		textDisplayT.setColumns(10);
		
		textDisplayF = new JTextField();
		textDisplayT.setText(num_food+"");
		textDisplayF.setColumns(10);
		/**Jlabel for display the max number of each window*/
		JLabel lblMax = new JLabel("Max:5000");
		JLabel lblMax_1 = new JLabel("Max:5000");
		JLabel lblMax_2 = new JLabel("Max:10");
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
								.addGroup(gl_contentPane.createSequentialGroup()
									.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
										.addGroup(gl_contentPane.createSequentialGroup()
											.addGap(10)
											.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
												.addComponent(btnNextDay)
												.addGroup(gl_contentPane.createSequentialGroup()
													.addGap(5)
													.addComponent(lblDays)
													.addPreferredGap(ComponentPlacement.UNRELATED)
													.addComponent(txtDays, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))))
										.addGroup(gl_contentPane.createSequentialGroup()
											.addContainerGap()
											.addComponent(btnFeedPet))
										.addGroup(gl_contentPane.createSequentialGroup()
											.addContainerGap()
											.addComponent(btnPlayWithPet))
										.addGroup(gl_contentPane.createSequentialGroup()
											.addContainerGap()
											.addComponent(btnPutPetTo))
										.addGroup(gl_contentPane.createSequentialGroup()
											.addContainerGap()
											.addComponent(textHealth, GroupLayout.PREFERRED_SIZE, 48, GroupLayout.PREFERRED_SIZE))
										.addGroup(gl_contentPane.createSequentialGroup()
											.addContainerGap()
											.addComponent(lblHealth))
										.addGroup(gl_contentPane.createSequentialGroup()
											.addContainerGap()
											.addComponent(txtData, GroupLayout.PREFERRED_SIZE, 48, GroupLayout.PREFERRED_SIZE)
											.addPreferredGap(ComponentPlacement.RELATED)
											.addComponent(lblMax))
										.addGroup(gl_contentPane.createSequentialGroup()
											.addContainerGap()
											.addComponent(lblHungry))
										.addGroup(gl_contentPane.createSequentialGroup()
											.addContainerGap()
											.addComponent(textMood, GroupLayout.PREFERRED_SIZE, 48, GroupLayout.PREFERRED_SIZE)
											.addPreferredGap(ComponentPlacement.RELATED)
											.addComponent(lblMax_1)))
									.addGap(31)
									.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
										.addComponent(btnLetPetLive)
										.addComponent(desktopPane, GroupLayout.PREFERRED_SIZE, 146, GroupLayout.PREFERRED_SIZE)))
								.addGroup(gl_contentPane.createSequentialGroup()
									.addContainerGap()
									.addGroup(gl_contentPane.createParallelGroup(Alignment.TRAILING, false)
										.addComponent(textTired, Alignment.LEADING, 0, 0, Short.MAX_VALUE)
										.addComponent(lblFatigue, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
									.addPreferredGap(ComponentPlacement.RELATED)
									.addComponent(lblMax_2)))
							.addGap(6)
							.addGroup(gl_contentPane.createParallelGroup(Alignment.TRAILING, false)
								.addGroup(gl_contentPane.createSequentialGroup()
									.addComponent(lblFoodForFeed)
									.addPreferredGap(ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
									.addComponent(comboBox_1, GroupLayout.PREFERRED_SIZE, 105, GroupLayout.PREFERRED_SIZE))
								.addGroup(gl_contentPane.createSequentialGroup()
									.addComponent(lblToysForPlay)
									.addPreferredGap(ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
									.addComponent(comboBox, GroupLayout.PREFERRED_SIZE, 105, GroupLayout.PREFERRED_SIZE))
								.addComponent(desktopPane_1, GroupLayout.PREFERRED_SIZE, 142, GroupLayout.PREFERRED_SIZE))
							.addGap(58)
							.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
								.addComponent(desktopPane_2, GroupLayout.PREFERRED_SIZE, 146, GroupLayout.PREFERRED_SIZE)
								.addGroup(gl_contentPane.createParallelGroup(Alignment.TRAILING, false)
									.addComponent(textDisplayT, Alignment.LEADING)
									.addComponent(textDisplayF, Alignment.LEADING))))
						.addGroup(gl_contentPane.createSequentialGroup()
							.addContainerGap()
							.addComponent(lblMood, GroupLayout.PREFERRED_SIZE, 48, GroupLayout.PREFERRED_SIZE)))
					.addContainerGap(169, Short.MAX_VALUE))
		);
		gl_contentPane.setVerticalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGap(28)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING, false)
								.addGroup(gl_contentPane.createSequentialGroup()
									.addGap(38)
									.addComponent(btnNextDay)
									.addGap(39)
									.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
										.addComponent(txtDays, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
										.addComponent(lblDays))
									.addGap(44)
									.addComponent(btnFeedPet)
									.addGap(18)
									.addComponent(btnPlayWithPet)
									.addGap(18)
									.addComponent(btnPutPetTo)
									.addPreferredGap(ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
									.addComponent(lblHungry)
									.addGap(18)
									.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
										.addComponent(txtData, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
										.addComponent(lblMax))
									.addPreferredGap(ComponentPlacement.RELATED)
									.addComponent(lblHealth)
									.addPreferredGap(ComponentPlacement.RELATED)
									.addComponent(textHealth, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
								.addComponent(desktopPane, GroupLayout.PREFERRED_SIZE, 409, GroupLayout.PREFERRED_SIZE)
								.addComponent(desktopPane_1, GroupLayout.PREFERRED_SIZE, 409, GroupLayout.PREFERRED_SIZE))
							.addGap(5)
							.addComponent(lblMood))
						.addComponent(desktopPane_2, GroupLayout.PREFERRED_SIZE, 409, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(comboBox, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblToysForPlay)
						.addComponent(textMood, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(btnLetPetLive, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
						.addComponent(textDisplayT, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblMax_1))
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(lblFatigue)
							.addPreferredGap(ComponentPlacement.UNRELATED)
							.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
								.addComponent(textTired, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
								.addComponent(lblMax_2)))
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(18)
							.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
								.addComponent(comboBox_1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
								.addComponent(lblFoodForFeed)
								.addComponent(textDisplayF, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))))
					.addGap(14))
		);
		contentPane.setLayout(gl_contentPane);
	}
}
