package ch.unibe.ese.team1.test.testData;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.LinkedList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import ch.unibe.ese.team1.model.Ad;
import ch.unibe.ese.team1.model.AdPicture;
import ch.unibe.ese.team1.model.Type;
import ch.unibe.ese.team1.model.User;
import ch.unibe.ese.team1.model.dao.AdDao;
import ch.unibe.ese.team1.model.dao.UserDao;

/** This inserts several ad elements into the database. */
@Service
public class AdTestDataSaver {

	@Autowired
	private AdDao adDao;
	@Autowired
	private UserDao userDao;

	@Transactional
	public void saveTestData() throws Exception {
		User bernerBaer = userDao.findByUsername("user@bern.com");
		User ese = userDao.findByUsername("ese@unibe.ch");
		User oprah = userDao.findByUsername("oprah@winfrey.com");
		User jane = userDao.findByUsername("jane@doe.com");
		User hans = userDao.findByUsername("hans@unibe.ch");
		User mathilda = userDao.findByUsername("mathilda@unibe.ch");
		
		SimpleDateFormat formatter = new SimpleDateFormat("dd.MM.yyyy");
		
		Date creationDate1 = formatter.parse("03.10.2014");
		Date creationDate2 = formatter.parse("11.10.2014");
		Date creationDate3 = formatter.parse("25.10.2014");
		Date creationDate4 = formatter.parse("02.11.2014");
		Date creationDate5 = formatter.parse("25.11.2013");
		Date creationDate6 = formatter.parse("01.12.2014");
		Date creationDate7 = formatter.parse("16.11.2014");
		Date creationDate8 = formatter.parse("27.11.2014");
		
		Date moveInDate1 = formatter.parse("15.12.2014");
		Date moveInDate2 = formatter.parse("21.12.2014");
		Date moveInDate3 = formatter.parse("01.01.2015");
		Date moveInDate4 = formatter.parse("15.01.2015");
		Date moveInDate5 = formatter.parse("01.02.2015");
		Date moveInDate6 = formatter.parse("01.03.2015");
		Date moveInDate7 = formatter.parse("15.03.2015");
		Date moveInDate8 = formatter.parse("16.02.2015");
		
		Date moveOutDate1 = formatter.parse("31.03.2015");
		Date moveOutDate2 = formatter.parse("30.04.2015");
		Date moveOutDate3 = formatter.parse("31.03.2016");
		Date moveOutDate4 = formatter.parse("01.07.2015");
		Date moveOutDate5 = formatter.parse("30.09.2016");
		
		Date auctionEndingDate = formatter.parse("31.12.2017");
		
		
		String roomDescription1 = "The room is a part of 3.5 rooms apartment completely renovated"
				+ "in 2010 at Kramgasse, Bern. The apartment is about 50 m2 on 1st floor."
				+ "Apt is equipped modern kitchen, hall and balcony. Near to shops and public"
				+ "transportation. Monthly rent is 500 CHF including charges. Internet + TV + landline"
				+ "charges are separate. If you are interested, feel free to drop me a message"
				+ "to have an appointment for a visit or can write me for any further information";
		String preferences1 = "Uncomplicated, open minded and easy going person (m / w),"
				+ "non-smoker, can speak English, which of course fits in the WG, and who likes dogs."
				+ "Cleanliness is must. Apart from personal life, sometimes glass of wine,"
				+ "eat and cook together and go out in the evenings.";

		Ad adBern = new Ad();
		adBern.setZipcode(3011);
		adBern.setCreationDate(creationDate1);
		adBern.setSquareFootage(50);
                adBern.setType(Type.room);
		adBern.setSmokers(false);
		adBern.setAnimals(true);
		adBern.setRoomDescription(roomDescription1);
		adBern.setPreferences(preferences1);
		adBern.setUser(bernerBaer);
		adBern.setTitle("Roommate wanted in Bern");
		adBern.setStreet("Kramgasse 22");
		adBern.setCity("Bern");
		adBern.setGarden(true);
		adBern.setBalcony(true);
		adBern.setCellar(true);
		adBern.setFurnished(true);
		adBern.setCable(true);
		adBern.setGarage(true);
		adBern.setInternet(true);
		adBern.setDishwasher(true);
		adBern.setAuctionEndingDate(auctionEndingDate);
		adBern.setAuctionStartingPrice(30000);
		adBern.setOfferType(1);
		List<AdPicture> pictures = new ArrayList<>();
		pictures.add(createPicture(adBern, "/img/test/ad1_1.jpg"));
		pictures.add(createPicture(adBern, "/img/test/ad1_2.jpg"));
		pictures.add(createPicture(adBern, "/img/test/ad1_3.jpg"));
		adBern.setPictures(pictures);
		adDao.save(adBern);

		String studioDescription2 = "It is small studio close to the"
				+ "university and the bahnhof. The lovely neighbourhood"
				+ "Langgasse makes it an easy place to feel comfortable."
				+ "The studio is close to a Migross, Denner and the Coop."
				+ "The studio is 60m2. It has it own Badroom and kitchen."
				+ "Nothing is shared. The studio is fully furnished. The"
				+ "studio is also provided with a balcony. So if you want to"
				+ "have a privat space this could totally be good place for you."
				+ "Be aware it is only till the end of March. The price is from"
				+ "550- 700 CHF, But there is always room to talk about it.";
		String roomPreferences2 = "I would like to have an easy going person who"
				+ "is trustworthy and can take care of the flat. No animals please."
				+ "Non smoker preferred.";
		
		Ad adBern2 = new Ad();
		adBern2.setZipcode(3012);
		adBern2.setCreationDate(creationDate2);
		adBern2.setDirectBuyPrice(300000);
		adBern2.setSquareFootage(60);
                adBern2.setType(Type.studio);
		adBern2.setOfferType(2);
		adBern2.setSmokers(false);
		adBern2.setAnimals(true);
		adBern2.setRoomDescription(studioDescription2);
		adBern2.setPreferences(roomPreferences2);
		adBern2.setUser(ese);
		adBern2.setTitle("Cheap studio in Bern!");
		adBern2.setStreet("Längassstr. 40");
		adBern2.setCity("Bern");
		adBern2.setGarden(false);
		adBern2.setBalcony(false);
		adBern2.setCellar(false);
		adBern2.setFurnished(false);
		adBern2.setCable(false);
		adBern2.setGarage(false);
		adBern2.setInternet(true);
		adBern2.setDishwasher(true);
		pictures = new ArrayList<>();
		pictures.add(createPicture(adBern2, "/img/test/ad2_1.jpg"));
		pictures.add(createPicture(adBern2, "/img/test/ad2_2.jpg"));
		pictures.add(createPicture(adBern2, "/img/test/ad2_3.jpg"));
		adBern2.setPictures(pictures);
		adDao.save(adBern2);

		String studioDescription3 = " In the center of Gundeli (5 Min. away from the"
				+ "station, close to Tellplatz) there is a lovely house, covered with"
				+ "savage wine stocks, without any neighbours but with a garden. The"
				+ "house has two storey, on the first floor your new room is waiting"
				+ "for you. The house is totally equipped with everything a household "
				+ ": washing machine, kitchen, batroom, W-Lan...if you don´t have any"
				+ "furniture, don´t worry, I am sure, we will find something around"
				+ "the house. The price for the room and all included is 480 CHF /month. "
				+ " (29, Graphic designer) and Linda (31, curator) are looking for a"
				+ "new female flatmate from December on.";
		String roomPreferences3 = "smoking female flatmate";
		
		Ad adBasel = new Ad();
		adBasel.setZipcode(4051);
		adBasel.setCreationDate(creationDate3);
		adBasel.setAuctionStartingPrice(500000);
		adBasel.setAuctionEndingDate(auctionEndingDate);
		adBasel.setSquareFootage(100);
                adBasel.setType(Type.studio);
		adBasel.setOfferType(1);
		adBasel.setSmokers(true);
		adBasel.setAnimals(false);
		adBasel.setRoomDescription(studioDescription3);
		adBasel.setPreferences(roomPreferences3);
		adBasel.setUser(bernerBaer);
		adBasel.setTitle("Nice, bright studio in the center of Basel");
		adBasel.setStreet("Bruderholzstrasse 32");
		adBasel.setCity("Basel");
		adBasel.setGarden(false);
		adBasel.setBalcony(false);
		adBasel.setCellar(false);
		adBasel.setFurnished(false);
		adBasel.setCable(false);
		adBasel.setGarage(false);
		adBasel.setInternet(false);
		adBasel.setDishwasher(true);
		pictures = new ArrayList<>();
		pictures.add(createPicture(adBasel, "/img/test/ad3_1.jpg"));
		pictures.add(createPicture(adBasel, "/img/test/ad3_2.jpg"));
		pictures.add(createPicture(adBasel, "/img/test/ad3_3.jpg"));
		adBasel.setPictures(pictures);
		adDao.save(adBasel);
		
		String studioDescription4 = "Flatshare of 3 persons. Flat with 5 rooms"
				+ "on the second floor. The bedroom is about 60 square meters"
				+ "with access to a nice balcony. In addition to the room, the"
				+ "flat has: a living room, a kitchen, a bathroom, a seperate WC,"
				+ "a storage in the basement, a balcony, a laundry room in the basement."
				+ "The bedroom is big and bright and has a nice parquet floor."
				+ "Possibility to keep some furnitures like the bed.";
		String roomPreferences4 = "an easy going flatmate man or woman between 20 and 30";
		
		Ad adOlten = new Ad();
		adOlten.setZipcode(4600);
		adOlten.setMoveInDate(moveInDate4);
		adOlten.setCreationDate(creationDate4);
		adOlten.setPricePerMonth(430);
		adOlten.setSquareFootage(60);
		adOlten.setOfferType(0);
                adOlten.setType(Type.studio);
		adOlten.setSmokers(true);
		adOlten.setAnimals(false);
		adOlten.setRoomDescription(studioDescription4);
		adOlten.setPreferences(roomPreferences4);
		adOlten.setUser(ese);
		adOlten.setTitle("Roommate wanted in Olten City");
		adOlten.setStreet("Zehnderweg 5");
		adOlten.setCity("Olten");
		adOlten.setGarden(false);
		adOlten.setBalcony(true);
		adOlten.setCellar(true);
		adOlten.setFurnished(true);
		adOlten.setCable(true);
		adOlten.setGarage(false);
		adOlten.setInternet(false);
		adOlten.setDishwasher(false);
		pictures = new ArrayList<>();
		pictures.add(createPicture(adOlten, "/img/test/ad4_1.png"));
		pictures.add(createPicture(adOlten, "/img/test/ad4_2.png"));
		pictures.add(createPicture(adOlten, "/img/test/ad4_3.png"));
		adOlten.setPictures(pictures);
		adDao.save(adOlten);

		String studioDescription5 = "Studio meublé au 3ème étage, comprenant"
				+ "une kitchenette entièrement équipée (frigo, plaques,"
				+ "four et hotte), une pièce à vivre donnant sur un balcon,"
				+ "une salle de bains avec wc. Cave, buanderie et site satellite"
				+ "à disposition.";
		String roomPreferences5 = "tout le monde est bienvenu";
		
		Ad adNeuchâtel = new Ad();
		adNeuchâtel.setZipcode(2000);
		adNeuchâtel.setCreationDate(creationDate5);
		adNeuchâtel.setDirectBuyPrice(150000);
		adNeuchâtel.setSquareFootage(40);
                adNeuchâtel.setType(Type.studio);
		adNeuchâtel.setOfferType(2);
		adNeuchâtel.setSmokers(true);
		adNeuchâtel.setAnimals(false);
		adNeuchâtel.setRoomDescription(studioDescription5);
		adNeuchâtel.setPreferences(roomPreferences5);
		adNeuchâtel.setUser(bernerBaer);
		adNeuchâtel.setTitle("Studio extrèmement bon marché à Neuchâtel");
		adNeuchâtel.setStreet("Rue de l'Hôpital 11");
		adNeuchâtel.setCity("Neuchâtel");
		adNeuchâtel.setGarden(true);
		adNeuchâtel.setBalcony(false);
		adNeuchâtel.setCellar(true);
		adNeuchâtel.setFurnished(true);
		adNeuchâtel.setCable(false);
		adNeuchâtel.setGarage(false);
		adNeuchâtel.setInternet(true);
		adNeuchâtel.setDishwasher(false);
		pictures = new ArrayList<>();
		pictures.add(createPicture(adNeuchâtel, "/img/test/ad5_1.jpg"));
		pictures.add(createPicture(adNeuchâtel, "/img/test/ad5_2.jpg"));
		pictures.add(createPicture(adNeuchâtel, "/img/test/ad5_3.jpg"));
		adNeuchâtel.setPictures(pictures);
		adDao.save(adNeuchâtel);

		String studioDescription6 = "A place just for yourself in a very nice part of Biel."
				+ "A studio for 1-2 persons with a big balcony, bathroom, kitchen and furniture already there."
				+ "It's quiet and nice, very close to the old city of Biel.";
		String roomPreferences6 = "A nice and easy going person. Minimum rent is two months";
		
		Ad adBiel = new Ad();
		adBiel.setZipcode(2503);
		adBiel.setMoveInDate(moveInDate6);
		adBiel.setMoveOutDate(moveOutDate5);
		adBiel.setCreationDate(creationDate6);
		adBiel.setPricePerMonth(480);
		adBiel.setSquareFootage(10);
                adBiel.setType(Type.room);
		adBiel.setSmokers(true);
		adBiel.setAnimals(false);
		adBiel.setOfferType(0);
		adBiel.setDishwasher(true);
		adBiel.setRoomDescription(studioDescription6);
		adBiel.setPreferences(roomPreferences6);
		adBiel.setUser(ese);
		adBiel.setTitle("Direkt am Quai: hübsches Studio");
		adBiel.setStreet("Oberer Quai 12");
		adBiel.setCity("Biel/Bienne");
		adBiel.setGarden(false);
		adBiel.setBalcony(false);
		adBiel.setCellar(false);
		adBiel.setFurnished(false);
		adBiel.setCable(false);
		adBiel.setGarage(false);
		adBiel.setInternet(false);
		pictures = new ArrayList<>();
		pictures.add(createPicture(adBiel, "/img/test/ad6_1.png"));
		pictures.add(createPicture(adBiel, "/img/test/ad6_2.png"));
		pictures.add(createPicture(adBiel, "/img/test/ad6_3.png"));
		adBiel.setPictures(pictures);
		adDao.save(adBiel);
		
		
		String roomDescription7 = "The room is a part of 3.5 rooms apartment completely renovated"
				+ "in 2010 at Kramgasse, Bern. The apartment is about 50 m2 on 1st floor."
				+ "Apt is equipped modern kitchen, hall and balcony. Near to shops and public"
				+ "transportation. Monthly rent is 500 CHF including charges. Internet + TV + landline"
				+ "charges are separate. If you are interested, feel free to drop me a message"
				+ "to have an appointment for a visit or can write me for any further information";
		String preferences7 = "Uncomplicated, open minded and easy going person (m / w),"
				+ "non-smoker, can speak English, which of course fits in the WG, and who likes dogs."
				+ "Cleanliness is must. Apart from personal life, sometimes glass of wine,"
				+ "eat and cook together and go out in the evenings.";

		Ad adZurich = new Ad();
		adZurich.setZipcode(8000);
		adZurich.setCreationDate(creationDate7);
		adZurich.setAuctionEndingDate(auctionEndingDate);
		adZurich.setAuctionStartingPrice(75000);
		adZurich.setSquareFootage(32);
                adZurich.setType(Type.room);
		adZurich.setOfferType(1);
		adZurich.setSmokers(false);
		adZurich.setAnimals(false);
		adZurich.setRoomDescription(roomDescription7);
		adZurich.setPreferences(preferences7);
		adZurich.setUser(oprah);
		adZurich.setTitle("Roommate wanted in Zürich");
		adZurich.setStreet("Hauptstrasse 61");
		adZurich.setCity("Zürich");
		adZurich.setGarden(false);
		adZurich.setBalcony(true);
		adZurich.setCellar(false);
		adZurich.setFurnished(true);
		adZurich.setCable(true);
		adZurich.setGarage(true);
		adZurich.setInternet(true);
		adZurich.setDishwasher(false);
		pictures = new ArrayList<>();
		pictures.add(createPicture(adZurich, "/img/test/ad1_3.jpg"));
		pictures.add(createPicture(adZurich, "/img/test/ad1_2.jpg"));
		pictures.add(createPicture(adZurich, "/img/test/ad1_1.jpg"));
		adZurich.setPictures(pictures);
		adDao.save(adZurich);
	
		
		String studioDescription8 = "It is small studio close to the"
				+ "university and the bahnhof. The lovely neighbourhood"
				+ "Langgasse makes it an easy place to feel comfortable."
				+ "The studio is close to a Migross, Denner and the Coop."
				+ "The studio is 60m2. It has it own Badroom and kitchen."
				+ "Nothing is shared. The studio is fully furnished. The"
				+ "studio is also provided with a balcony. So if you want to"
				+ "have a privat space this could totally be good place for you."
				+ "Be aware it is only till the end of March. The price is from"
				+ "550- 700 CHF, But there is always room to talk about it.";
		String roomPreferences8 = "I would like to have an easy going person who"
				+ "is trustworthy and can take care of the flat. No animals please."
				+ "Non smoker preferred.";
		
		Ad adLuzern = new Ad();
		adLuzern.setZipcode(6000);
		adLuzern.setAuctionEndingDate(auctionEndingDate);
		adLuzern.setAuctionStartingPrice(50000);
		adLuzern.setCreationDate(creationDate2);
		adLuzern.setSquareFootage(60);
                adLuzern.setType(Type.property);
		adLuzern.setOfferType(1);
		adLuzern.setSmokers(false);
		adLuzern.setAnimals(false);
		adLuzern.setRoomDescription(studioDescription8);
		adLuzern.setPreferences(roomPreferences8);
		adLuzern.setUser(oprah);
		adLuzern.setTitle("Elegant Studio in Lucerne");
		adLuzern.setStreet("Schwanenplatz 61");
		adLuzern.setCity("Luzern");
		adLuzern.setGarden(false);
		adLuzern.setBalcony(false);
		adLuzern.setCellar(false);
		adLuzern.setFurnished(false);
		adLuzern.setCable(false);
		adLuzern.setGarage(false);
		adLuzern.setInternet(true);
		adLuzern.setDishwasher(false);
		pictures = new ArrayList<>();
		pictures.add(createPicture(adLuzern, "/img/test/ad2_3.jpg"));
		pictures.add(createPicture(adLuzern, "/img/test/ad2_2.jpg"));
		pictures.add(createPicture(adLuzern, "/img/test/ad2_1.jpg"));
		adLuzern.setPictures(pictures);
		adDao.save(adLuzern);

		String studioDescription9 = " In the center of Gundeli (5 Min. away from the"
				+ "station, close to Tellplatz) there is a lovely house, covered with"
				+ "savage wine stocks, without any neighbours but with a garden. The"
				+ "house has two storey, on the first floor your new room is waiting"
				+ "for you. The house is totally equipped with everything a household "
				+ ": washing machine, kitchen, batroom, W-Lan...if you don´t have any"
				+ "furniture, don´t worry, I am sure, we will find something around"
				+ "the house. The price for the room and all included is 480 CHF /month. "
				+ " (29, Graphic designer) and Linda (31, curator) are looking for a"
				+ "new female flatmate from December on.";
		String roomPreferences9 = "smoking female flatmate";
		
		Ad adAarau = new Ad();
		adAarau.setZipcode(5000);
		adAarau.setCreationDate(creationDate8);
		adAarau.setDirectBuyPrice(50000);
		adAarau.setSquareFootage(26);
		adAarau.setOfferType(2);
                adAarau.setType(Type.property);
		adAarau.setSmokers(true);
		adAarau.setAnimals(false);
		adAarau.setRoomDescription(studioDescription9);
		adAarau.setPreferences(roomPreferences9);
		adAarau.setUser(oprah);
		adAarau.setTitle("Beautiful studio in Aarau");
		adAarau.setStreet("Bruderholzstrasse 32");
		adAarau.setCity("Aarau");
		adAarau.setGarden(false);
		adAarau.setBalcony(true);
		adAarau.setCellar(false);
		adAarau.setFurnished(true);
		adAarau.setCable(false);
		adAarau.setGarage(false);
		adAarau.setInternet(false);
		adAarau.setDishwasher(true);
		pictures = new ArrayList<>();
		pictures.add(createPicture(adAarau, "/img/test/ad3_3.jpg"));
		pictures.add(createPicture(adAarau, "/img/test/ad3_2.jpg"));
		pictures.add(createPicture(adAarau, "/img/test/ad3_1.jpg"));
		pictures.add(createPicture(adAarau, "/img/test/ad2_2.jpg"));
		pictures.add(createPicture(adAarau, "/img/test/ad2_3.jpg"));
		
		adAarau.setPictures(pictures);
		adDao.save(adAarau);
		
		String studioDescription10 = "Flatshare of 3 persons. Flat with 5 rooms"
				+ "on the second floor. The bedroom is about 60 square meters"
				+ "with access to a nice balcony. In addition to the room, the"
				+ "flat has: a living room, a kitchen, a bathroom, a seperate WC,"
				+ "a storage in the basement, a balcony, a laundry room in the basement."
				+ "The bedroom is big and bright and has a nice parquet floor."
				+ "Possibility to keep some furnitures like the bed.";
		String roomPreferences10 = "an easy going flatmate man or woman between 20 and 30";
		
		Ad adDavos = new Ad();
		adDavos.setZipcode(7260);
		adDavos.setMoveInDate(moveInDate2);
		adDavos.setCreationDate(creationDate4);
		adDavos.setPricePerMonth(1100);
		adDavos.setSquareFootage(74);
		adDavos.setOfferType(0);
                adDavos.setType(Type.room);
		adDavos.setSmokers(true);
		adDavos.setAnimals(false);
		adDavos.setRoomDescription(studioDescription10);
		adDavos.setPreferences(roomPreferences10);
		adDavos.setUser(oprah);
		adDavos.setTitle("Free room in Davos City");
		adDavos.setStreet("Kathrinerweg 5");
		adDavos.setCity("Davos");
		adDavos.setGarden(false);
		adDavos.setBalcony(true);
		adDavos.setCellar(true);
		adDavos.setFurnished(true);
		adDavos.setCable(true);
		adDavos.setGarage(false);
		adDavos.setInternet(false);
		adDavos.setDishwasher(false);
		pictures = new ArrayList<>();
		pictures.add(createPicture(adDavos, "/img/test/ad4_3.png"));
		pictures.add(createPicture(adDavos, "/img/test/ad4_2.png"));
		pictures.add(createPicture(adDavos, "/img/test/ad4_1.png"));
		adDavos.setPictures(pictures);
		adDao.save(adDavos);

		String studioDescription11 = "Studio meublé au 3ème étage, comprenant"
				+ "une kitchenette entièrement équipée (frigo, plaques,"
				+ "four et hotte), une pièce à vivre donnant sur un balcon,"
				+ "une salle de bains avec wc. Cave, buanderie et site satellite"
				+ "à disposition.";
		String roomPreferences11 = "tout le monde est bienvenu";
		
		Ad adLausanne = new Ad();
		adLausanne.setZipcode(1000);
		adLausanne.setAuctionEndingDate(auctionEndingDate);
		adLausanne.setAuctionStartingPrice(350);
		adLausanne.setCreationDate(creationDate5);
		adLausanne.setPricePerMonth(360);
		adLausanne.setSquareFootage(16);
                adLausanne.setType(Type.room);
		adLausanne.setOfferType(1);
		adLausanne.setSmokers(true);
		adLausanne.setAnimals(false);
		adLausanne.setRoomDescription(studioDescription11);
		adLausanne.setPreferences(roomPreferences11);
		adLausanne.setUser(oprah);
		adLausanne.setTitle("Studio extrèmement bon marché à Lausanne");
		adLausanne.setStreet("Rue de l'Eglise 26");
		adLausanne.setCity("Lausanne");
		adLausanne.setGarden(true);
		adLausanne.setBalcony(false);
		adLausanne.setCellar(true);
		adLausanne.setFurnished(true);
		adLausanne.setCable(false);
		adLausanne.setGarage(false);
		adLausanne.setInternet(false);
		adLausanne.setDishwasher(true);
		pictures = new ArrayList<>();
		pictures.add(createPicture(adLausanne, "/img/test/ad5_3.jpg"));
		pictures.add(createPicture(adLausanne, "/img/test/ad5_2.jpg"));
		pictures.add(createPicture(adLausanne, "/img/test/ad5_1.jpg"));
		adLausanne.setPictures(pictures);
		adDao.save(adLausanne);

		String studioDescription12 = "A place just for yourself in a very nice part of Biel."
				+ "A studio for 1-2 persons with a big balcony, bathroom, kitchen and furniture already there."
				+ "It's quiet and nice, very close to the old city of Biel.";
		String roomPreferences12 = "A nice and easy going person. Minimum rent is two months";
		
		Ad adLocarno = new Ad();
		adLocarno.setZipcode(6600);
		adLocarno.setMoveInDate(moveInDate6);
		adLocarno.setMoveOutDate(moveOutDate5);
		adLocarno.setCreationDate(creationDate6);
		adLocarno.setPricePerMonth(960);
		adLocarno.setSquareFootage(42);
                adLocarno.setType(Type.studio);
		adLocarno.setOfferType(0);
		adLocarno.setSmokers(true);
		adLocarno.setAnimals(false);
		adLocarno.setRoomDescription(studioDescription12);
		adLocarno.setPreferences(roomPreferences12);
		adLocarno.setUser(jane);
		adLocarno.setTitle("Malibu-style Beachhouse");
		adLocarno.setStreet("Kirchweg 12");
		adLocarno.setCity("Locarno");
		adLocarno.setGarden(false);
		adLocarno.setBalcony(false);
		adLocarno.setCellar(false);
		adLocarno.setFurnished(false);
		adLocarno.setCable(false);
		adLocarno.setGarage(false);
		adLocarno.setInternet(false);
		adLocarno.setDishwasher(true);
		pictures = new ArrayList<>();
		pictures.add(createPicture(adLocarno, "/img/test/ad6_3.png"));
		pictures.add(createPicture(adLocarno, "/img/test/ad6_2.png"));
		pictures.add(createPicture(adLocarno, "/img/test/ad6_1.png"));
		adLocarno.setPictures(pictures);
		adDao.save(adLocarno);

	}

	private AdPicture createPicture(Ad ad, String filePath) {
		AdPicture picture = new AdPicture();
		picture.setFilePath(filePath);
		return picture;
	}

}