package att.group.database;

import att.group.model.Image;
import att.group.model.Product;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class MockData {

    public static final Map<Integer, Product> productDB = new HashMap<>();
    public static final Map<Integer, Product> bestSellerProducts = new HashMap<>();

    static {
        //List of product will be here
        Product p1 = new Product();
        p1.setProductName("AutoCraft Gold Battery, Group Size H7, 800 CCA");
        p1.setBrand("AutoCraft");
        p1.setBriefInformation("Engineered with PowerFrame positive grid technology which virtually eliminates premature failure and is up to 66% more durable and more corrosion-resistant than other grid designs");
        p1.setDetailInformation("Autocraft Gold automotive batteries are engineered for maximum starting power in any climate. That means you can relax knowing you'll get your car started, even on the coldest and hottest of days. Autocraft Gold automotive batteries meet or exceed the manufacturers power (CCA) requirements for your vehicle, ensuring you get the power you need for a quick start every time. Autocraft Gold batteries are engineered with PowerFrame grid technology, a stronger and more durable positive grid technology. If you are looking for more power, upgrade to the Autocraft Platinum AGM. Don't want to bother with installing your new Autocraft battery? Stop by your nearest Advance Auto Parts store and take advantage of our FREE battery testing and installation on most vehicles and at most locations. We offer free battery and electrical system testing and free recycling of your old automotive battery. Advance Auto Parts offers helpful advice about a variety of products, including car batteries. Be sure to check out the following:\n" +
                "\n" +
                "How to choose the best car battery\n" +
                "How to test a car battery\n" +
                "How to replace your car battery\n" +
                "Order your Autocraft car battery replacement today. Enjoy reliable starting power with no maintenance every season. ");
        p1.setPrice(375.0);
        p1.setProductId(1001);
        p1.setImages(Arrays.asList(new Image("001_autocraft_gold_800cca.jpg"), new Image("001_autocraft_gold_800cca.jpg") ));


        Product p2 = new Product();
        p2.setProductName("AutoCraft Gold Battery, Group Size H6, 730 CCA");
        p2.setBrand("AutoCraft");
        p2.setBriefInformation("PowerFrame grid technology provides superior starting performance with up to 70% better electrical flow than other grid technologies. This means more consistent starts.");
        p2.setDetailInformation("Product Features:\n" +
                "Engineered with PowerFrame positive grid technology which virtually eliminates premature failure and is up to 66% more durable and more corrosion-resistant than other grid designs\n" +
                "PowerFrame grid technology provides superior starting performance with up to 70% better electrical flow than other grid technologies. This means more consistent starts\n" +
                "PowerFrame manufacturing process uses 20% less energy and releases 20% fewer greenhouse gas emissions than other manufacturing methods\n" +
                "Built to meet or exceed vehicle starting power requirements\n" +
                "Maintenance free for maximum convenience");
        p2.setPrice(280.0);
        p2.setProductId(1002);
        p2.setImages(Arrays.asList(new Image("002_autocraft_gold_730cca.jpg"), new Image("002_autocraft_gold_730cca.jpg") ));


        Product p3 = new Product();
        p3.setProductName("AutoCraft Platinum AGM Battery, Group Size H7, 850 CCA");
        p3.setBrand("AutoCraft");
        p3.setBriefInformation("Robust design offers exceptional high temperature climate performance and the most reliable starting power in cold conditions.");
        p3.setDetailInformation(
                "Part No. H7-AGM\n" +
                "Warranty Details (3 YR FREE REPLACEMENT)\n" +
                "\n" +
                "Autocraft Platinum AGM (Absorbent Glass Mat) batteries are specifically designed for today's power hungry vehicles. Autocraft Platinum AGM batteries are engineered to provide up to 2x the life vs. a standard flooded battery. This battery is ideal for vehicles with electrical accessories (DVD players, heated seats, GPS, plug-in accessories) which put a heavier demand on the battery or vehicles with start-stop technology. Autocraft Platinum AGM batteries are engineered with PowerFrame grid technology, a stronger and more durable positive grid technology.Don't want to bother with installing your new Autocraft battery? Stop by your nearest Advance Auto Parts store and take advantage of our FREE battery testing and installation on most vehicles and at most locations. We offer free battery and electrical system testing and free recycling of your old automotive battery. Advance Auto Parts offers helpful advice about a variety of products, including car batteries. Be sure to check out the following:\n" +
                "\n" +
                "How to choose the best car battery\n" +
                "How to test a car battery\n" +
                "How to replace your car battery\n" +
                "Order your Autocraft car battery replacement today. Enjoy reliable starting power with no maintenance every season. \n" +
                "\n" +
                "Product Features:\n" +
                "Up to 2x the life vs. a standard flooded battery\n" +
                "Designed for vehicles with high electrical demands or accessories and vehicles with start-stop technology\n" +
                "Non-spillable design allows for installation in any location, including in-vehicle\n" +
                "Robust design offers exceptional high temperature climate performance and the most reliable starting power in cold conditions\n" +
                "Higher level of vibration resistance compared to standard flooded batteries\n" +
                "Engineered with PowerFrame positive grid technology which virtually eliminates premature failure and is up to 66% more durable and more corrosion-resistant than other grid designs\n" +
                "PowerFrame grid technology provides superior starting performance with up to 70% better electrical flow than other grid technologies. This means more consistent starts\n" +
                "PowerFrame manufacturing process uses 20% less energy and releases 20% fewer greenhouse gas emissions than other manufacturing methods\n" +
                "Built to meet or exceed vehicle starting power requirements\n" +
                "Maintenance free for maximum convenience");
        p3.setPrice(400.0);
        p3.setProductId(1003);
        p3.setImages(Arrays.asList(new Image("003_autocraft_platinum_850cca.jpg"), new Image("003_autocraft_platinum_850cca.jpg") ));

        Product p4 = new Product();
        p4.setProductName("Sylvania 3157 LongLife Mini Bulb, Pack of 2");
        p4.setBrand("Sylvania");
        p4.setBriefInformation("SYLVANIA Long Life miniature bulbs perform twice as long as any standard miniature bulb from the leading supplier of automotive lighting. Designed for durability, lower maintenance and greater safety.");
        p4.setDetailInformation("Part No. 3157LLBP2\n" +
                "Warranty Details (1 YR REPLACEMENT IF DEFECTIVE)\n" +
                "\n" +
                "SYLVANIA Long Life miniature bulbs perform twice as long as any standard miniature bulb from the leading supplier of automotive lighting. Designed for durability, lower maintenance and greater safety.\n" +
                "\n" +
                "Product Features:\n" +
                "\n" +
                "Longer life than SYLVANIA Basic\n" +
                "Legal for on road use\n" +
                "OE quality\n" +
                "Lights dim over time\n" +
                "Replace lights in pairs");
        p4.setPrice(87.2);
        p4.setProductId(1004);
        p4.setImages(Arrays.asList(new Image("004_sylvania_3157.jpg"), new Image("004_sylvania_3157.jpg") ));

        Product p5 = new Product();
        p5.setProductName("Sylvania H11 XtraVision Halogen Bulb, Pack of 2");
        p5.setBrand("Sylvania");
        p5.setBriefInformation("SYLVANIA achieves this with a robust filament design and propriety gas mixture that can be driven for superior performance. The SYLVANIA XtraVision® headlight has also been designed for maximum durability.");
        p5.setDetailInformation("Part No. H11XVBP2\n" +
                "Warranty Details (1 YR REPLACEMENT IF DEFECTIVE)\n" +
                "\n" +
                "The SYLVANIA XtraVision® halogen headlight delivers more downroad visibility using a brighter light bulb with no added glare. SYLVANIA achieves this with a robust filament design and propriety gas mixture that can be driven for superior performance. The SYLVANIA XtraVision® headlight has also been designed for maximum durability.\n" +
                "\n" +
                "Product Features:\n" +
                "\n" +
                "More downroad performance than SYLVANIA Basic\n" +
                "Increased downroad visibility with no added glare\n" +
                "Manufactured by trusted OEM light source supplier\n" +
                "Legal for on road use\n" +
                "Lights dim over time, replace in pairs for optimal performance");
        p5.setPrice(94.3);
        p5.setProductId(1005);
        p5.setImages(Arrays.asList(new Image("005_syvania_h11.jpg"), new Image("005_syvania_h11.jpg") ));

        Product p6 = new Product();
        p6.setProductName("ACDelco Alternator");
        p6.setBrand("ACDelco");
        p6.setBriefInformation("ACDelco GM Original Equipment Light Duty Alternators have components that are newly manufactured, and are GM-recommended replacement for your vehicle's original alternator.");
        p6.setDetailInformation("Part No. 15279852\n" +
                "Warranty Details (2 YR REPLACEMENT IF DEFECTIVE)\n" +
                "\n" +
                "ACDelco GM Original Equipment Light Duty Alternators have components that are newly manufactured, and are GM-recommended replacement for your vehicle's original alternator. Alternators provide power to the vehicle's electrical systems and charge the battery while the engine is running. These original equipment alternators have been manufactured to fit your GM vehicle, providing the same performance, durability, and service life you expect from General Motors.\n" +
                "\n" +
                "Product Features:\n" +
                "\n" +
                "100% newly manufactured as an exact replacement for your GM vehicle's original alternator\n" +
                "Components are tested to meet original specification requirements for remarkable durability\n" +
                "GM-recommended replacement part for your GM vehicle's original factory component\n" +
                "Offering the quality, reliability, and durability of GM OE\n" +
                "Manufactured to GM OE specifications for fit, form, and function");
        p6.setPrice(151.99);
        p6.setProductId(1006);
        p6.setImages(Arrays.asList(new Image("006_acdelco_alternator.jpg"), new Image("006_acdelco_alternator.jpg") ));

        Product p7 = new Product();
        p7.setProductName("Tech Smart Power Distribution Center");
        p7.setBrand("Tech Smart");
        p7.setBriefInformation("Qualities that have made SMP an industry leader for more than 95 years, innovation, engineering expertise, superior quality, meticulous testing, unmatched customer service, competitive pricing, and brand integrity, are at the heart of every TechSmart part.");
        p7.setDetailInformation("Part No. R45001\n" +
                "Warranty Details (LIMITED LIFETIME REPLACEMENT)\n" +
                "\n" +
                "Qualities that have made SMP an industry leader for more than 95 years, innovation, engineering expertise, superior quality, meticulous testing, unmatched customer service, competitive pricing, and brand integrity, are at the heart of every TechSmart part.\n" +
                "\n" +
                "Product Features:\n" +
                "\n" +
                "Upgraded copper conductors and terminals have 72% more conductivity than brass counterparts\n" +
                "Upgraded 4 AWG copper cable can carry twice as much current as the competition\n" +
                "EPDM jacket can withstand abrasions and high temperatures better than the competition's PVC jacket\n" +
                "Flexible cantilever-spring contacts ensure positive connection after multiple fuse replacements");
        p7.setPrice(151.99);
        p7.setProductId(1007);
        p7.setImages(Arrays.asList(new Image("007_techsmart_power_distribution_center.jpg"), new Image("007_techsmart_power_distribution_center.jpg") ));

        Product p8 = new Product();
        p8.setProductName("Dorman - OE Solutions Dual Fan Assembly Without Controller");
        p8.setBrand("Dorman");
        p8.setBriefInformation("This engine cooling fan assembly is precision-engineered to match the fit and performance of the stock radiator fan on specific vehicle years, makes and models. It has been rigorously tested to ensure it cools as effectively as the original part.");
        p8.setDetailInformation("Part No. 620-799\n" +
                "Warranty Details (LIMITED LIFETIME REPLACEMENT)\n" +
                "\n" +
                "This engine cooling fan assembly is precision-engineered to match the fit and performance of the stock radiator fan on specific vehicle years, makes and models. It has been rigorously tested to ensure it cools as effectively as the original part.\n" +
                "\n" +
                "Product Features:\n" +
                "\n" +
                "Ideal replacement - this engine cooling fan assembly was precision-engineered to match the fit and performance of the stock radiator fan assembly on specific vehicles\n" +
                "Complete package - assembly is designed with the same materials and components as the original part\n" +
                "Quality assured - motors are tested in laboratory settings to ensure performance\n" +
                "Cost effective and reliable - trustworthy manufacturing for far less than same part at the dealership\n");
        p8.setPrice(164.99);
        p8.setProductId(1008);
        p8.setImages(Arrays.asList(new Image("008_dorman_oe_solutions.jpg"), new Image("008_dorman_oe_solutions.jpg") ));

        Product p9 = new Product();
        p9.setProductName("CARQUEST Engine Coolant Thermostat\n");
        p9.setBrand("CARQUEST");
        p9.setBriefInformation("Manufactured with OEM quality materials and safety standards by an OE Supplier. Stands up to even the most demanding automotive cooling systems.");
        p9.setDetailInformation("Part No. 14419\n" +
                "Warranty Details (1 YR REPLACEMENT IF DEFECTIVE)\n" +
                "\n" +
                "Manufactured with OEM quality materials and safety standards by an OE Supplier. Stands up to even the most demanding automotive cooling systems. Manufactured with OEM specifications and processes. Copper case and wax compound assures rapid response to temperature changes in the coolant.\n" +
                "\n" +
                "Product Features:\n" +
                "\n" +
                "High grade stainless steel and copper construction\n" +
                "Meets or exceeds OEM standards\n" +
                "Consistent and precise response to cooling system needs\n" +
                "Original equipment design for worry-free direct fit replacement\n" +
                "100% tested and calibrated");
        p9.setPrice(11.99);
        p9.setProductId(1009);
        p9.setImages(Arrays.asList(new Image("009_carquest_engine_coolant_thermostat.jpg"), new Image("009_carquest_engine_coolant_thermostat.jpg") ));

        productDB.put(1001, p1);
        productDB.put(1002, p2);
        productDB.put(1003, p3);
        productDB.put(1004, p4);
        productDB.put(1005, p5);
        productDB.put(1006, p6);
        productDB.put(1007, p7);
        productDB.put(1008, p8);
        productDB.put(1009, p9);

        bestSellerProducts.put(1003, p3);
        bestSellerProducts.put(1004, p4);
        bestSellerProducts.put(1008, p8);
        bestSellerProducts.put(1009, p9);
    }
}
