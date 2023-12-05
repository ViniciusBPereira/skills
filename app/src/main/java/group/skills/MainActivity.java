package group.skills;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;

import group.skills.list.cantrip.Acid_Splash;
import group.skills.list.cantrip.Create_Bonfire;
import group.skills.list.cantrip.Infestation;
import group.skills.list.cantrip.Mage_Hand;
import group.skills.list.level1.Fog_Cloud;
import group.skills.list.level1.Grease;
import group.skills.list.level1.Healing_Elixir;
import group.skills.list.level1.Ice_Knife;
import group.skills.list.level2.Air_Bubble;
import group.skills.list.level2.Cloud_of_Daggers;
import group.skills.list.level2.Dust_Devil;
import group.skills.list.level2.Flaming_Sphere;
import group.skills.list.level3.Conjure_Lesser_Demon;
import group.skills.list.level3.Sleet_Storm;
import group.skills.list.level3.Stinking_Cloud;
import group.skills.list.level3.Thunder_Step;
import group.skills.list.level4.Conjure_Minor_Elementals;
import group.skills.list.level4.Dimension_Door;
import group.skills.list.level4.Evards_Black_Tentacles;
import group.skills.list.level4.Galders_Speedy_Courier;
import group.skills.list.level5.Conjure_Elemental;
import group.skills.list.level5.Infernal_Calling;
import group.skills.list.level5.Steel_Wind_Strike;
import group.skills.list.level5.Teleportation_Circle;
import group.skills.list.level6.Arcane_Gate;
import group.skills.list.level6.Scatter_Conjuration;
import group.skills.list.level7.Dream_of_the_Blue_Veil;
import group.skills.list.level7.Plane_Shift;
import group.skills.list.level7.Teleport;
import group.skills.list.level8.Demiplane;
import group.skills.list.level8.Incendiary_Cloud;
import group.skills.list.level8.Maze;
import group.skills.list.level8.Mighty_Fortress;
import group.skills.list.level9.Blade_of_Disaster;
import group.skills.list.level9.Gate;
import group.skills.list.level9.Wish;

public class MainActivity extends AppCompatActivity {

    int i = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Acid_Splash acidSplash = new Acid_Splash();
        Create_Bonfire createBonfire = new Create_Bonfire();
        Infestation infestation = new Infestation();
        Mage_Hand mageHand = new Mage_Hand();

        Fog_Cloud fogCloud = new Fog_Cloud();
        Grease grease = new Grease();
        Healing_Elixir healingElixir = new Healing_Elixir();
        Ice_Knife iceKnife = new Ice_Knife();

        Air_Bubble airBubble = new Air_Bubble();
        Cloud_of_Daggers cloudOfDaggers = new Cloud_of_Daggers();
        Dust_Devil dustDevil = new Dust_Devil();
        Flaming_Sphere flamingSphere = new Flaming_Sphere();

        Conjure_Lesser_Demon conjureLesserDemon = new Conjure_Lesser_Demon();
        Sleet_Storm sleetStorm = new Sleet_Storm();
        Stinking_Cloud stinkingCloud = new Stinking_Cloud();
        Thunder_Step thunderStep = new Thunder_Step();

        Conjure_Minor_Elementals conjureMinorElementals = new Conjure_Minor_Elementals();
        Dimension_Door dimensionDoor = new Dimension_Door();
        Evards_Black_Tentacles evardsBlackTentacles = new Evards_Black_Tentacles();
        Galders_Speedy_Courier galdersSpeedyCourier = new Galders_Speedy_Courier();

        Conjure_Elemental conjureElemental = new Conjure_Elemental();
        Infernal_Calling infernalCalling = new Infernal_Calling();
        Steel_Wind_Strike steelWindStrike = new Steel_Wind_Strike();
        Teleportation_Circle teleportationCircle = new Teleportation_Circle();

        Arcane_Gate arcaneGate = new Arcane_Gate();
        Scatter_Conjuration scatterConjuration = new Scatter_Conjuration();

        Dream_of_the_Blue_Veil dreamOfTheBlueVeil = new Dream_of_the_Blue_Veil();
        Plane_Shift planeShift = new Plane_Shift();
        Teleport teleport = new Teleport();

        Demiplane demiplane = new Demiplane();
        Incendiary_Cloud incendiaryCloud = new Incendiary_Cloud();
        Maze maze = new Maze();
        Mighty_Fortress mightyFortress = new Mighty_Fortress();

        Blade_of_Disaster bladeOfDisaster = new Blade_of_Disaster();
        Gate gate = new Gate();
        Wish wish = new Wish();

        TextView n1 = findViewById(R.id.name1);
        TextView l1 = findViewById(R.id.lvl1);
        n1.setText(acidSplash.getName());
        l1.setText(acidSplash.getLevel());
        TextView n2 = findViewById(R.id.name2);
        TextView l2 = findViewById(R.id.lvl2);
        n2.setText(createBonfire.getName());
        l2.setText(createBonfire.getLevel());
        TextView n3 = findViewById(R.id.name3);
        TextView l3 = findViewById(R.id.lvl3);
        n3.setText(infestation.getName());
        l3.setText(infestation.getLevel());
        TextView n4 = findViewById(R.id.name4);
        TextView l4 = findViewById(R.id.lvl4);
        n4.setText(mageHand.getName());
        l4.setText(mageHand.getLevel());
        TextView n5 = findViewById(R.id.name5);
        TextView l5 = findViewById(R.id.lvl5);
        n5.setText(fogCloud.getName());
        l5.setText(fogCloud.getLevel());
        TextView n6 = findViewById(R.id.name6);
        TextView l6 = findViewById(R.id.lvl6);
        n6.setText(grease.getName());
        l6.setText(grease.getLevel());
        TextView n7 = findViewById(R.id.name7);
        TextView l7 = findViewById(R.id.lvl7);
        n7.setText(healingElixir.getName());
        l7.setText(healingElixir.getLevel());
        TextView n8 = findViewById(R.id.name8);
        TextView l8 = findViewById(R.id.lvl8);
        n8.setText(iceKnife.getName());
        l8.setText(iceKnife.getLevel());
        TextView n9 = findViewById(R.id.name9);
        TextView l9 = findViewById(R.id.lvl9);
        n9.setText(airBubble.getName());
        l9.setText(airBubble.getLevel());
        TextView n10 = findViewById(R.id.name10);
        TextView l10 = findViewById(R.id.lvl10);
        n10.setText(cloudOfDaggers.getName());
        l10.setText(cloudOfDaggers.getLevel());
        TextView n11 = findViewById(R.id.name11);
        TextView l11 = findViewById(R.id.lvl11);
        n11.setText(dustDevil.getName());
        l11.setText(dustDevil.getLevel());
        TextView n12 = findViewById(R.id.name12);
        TextView l12 = findViewById(R.id.lvl12);
        n12.setText(flamingSphere.getName());
        l12.setText(flamingSphere.getLevel());
        TextView n13 = findViewById(R.id.name13);
        TextView l13 = findViewById(R.id.lvl13);
        n13.setText(conjureLesserDemon.getName());
        l13.setText(conjureLesserDemon.getLevel());
        TextView n14 = findViewById(R.id.name14);
        TextView l14 = findViewById(R.id.lvl14);
        n14.setText(sleetStorm.getName());
        l14.setText(sleetStorm.getLevel());
        TextView n15 = findViewById(R.id.name15);
        TextView l15 = findViewById(R.id.lvl15);
        n15.setText(stinkingCloud.getName());
        l15.setText(stinkingCloud.getLevel());
        TextView n16 = findViewById(R.id.name16);
        TextView l16 = findViewById(R.id.lvl16);
        n16.setText(thunderStep.getName());
        l16.setText(thunderStep.getLevel());
        TextView n17 = findViewById(R.id.name17);
        TextView l17 = findViewById(R.id.lvl17);
        n17.setText(conjureMinorElementals.getName());
        l17.setText(conjureMinorElementals.getLevel());
        TextView n18 = findViewById(R.id.name18);
        TextView l18 = findViewById(R.id.lvl18);
        n18.setText(dimensionDoor.getName());
        l18.setText(dimensionDoor.getLevel());
        TextView n19 = findViewById(R.id.name19);
        TextView l19 = findViewById(R.id.lvl19);
        n19.setText(evardsBlackTentacles.getName());
        l19.setText(evardsBlackTentacles.getLevel());
        TextView n20 = findViewById(R.id.name20);
        TextView l20 = findViewById(R.id.lvl20);
        n20.setText(galdersSpeedyCourier.getName());
        l20.setText(galdersSpeedyCourier.getLevel());
        TextView n21 = findViewById(R.id.name21);
        TextView l21 = findViewById(R.id.lvl21);
        n21.setText(conjureElemental.getName());
        l21.setText(conjureElemental.getLevel());
        TextView n22 = findViewById(R.id.name22);
        TextView l22 = findViewById(R.id.lvl22);
        n22.setText(infernalCalling.getName());
        l22.setText(infernalCalling.getLevel());
        TextView n23 = findViewById(R.id.name23);
        TextView l23 = findViewById(R.id.lvl23);
        n23.setText(steelWindStrike.getName());
        l23.setText(steelWindStrike.getLevel());
        TextView n24 = findViewById(R.id.name24);
        TextView l24 = findViewById(R.id.lvl24);
        n24.setText(teleportationCircle.getName());
        l24.setText(teleportationCircle.getLevel());
        TextView n25 = findViewById(R.id.name25);
        TextView l25 = findViewById(R.id.lvl25);
        n25.setText(arcaneGate.getName());
        l25.setText(arcaneGate.getLevel());
        TextView n26 = findViewById(R.id.name26);
        TextView l26 = findViewById(R.id.lvl26);
        n26.setText(scatterConjuration.getName());
        l26.setText(scatterConjuration.getLevel());
        TextView n27 = findViewById(R.id.name27);
        TextView l27 = findViewById(R.id.lvl27);
        n27.setText(dreamOfTheBlueVeil.getName());
        l27.setText(dreamOfTheBlueVeil.getLevel());
        TextView n28 = findViewById(R.id.name28);
        TextView l28 = findViewById(R.id.lvl28);
        n28.setText(planeShift.getName());
        l28.setText(planeShift.getLevel());
        TextView n29 = findViewById(R.id.name29);
        TextView l29 = findViewById(R.id.lvl29);
        n29.setText(teleport.getName());
        l29.setText(teleport.getLevel());
        TextView n30 = findViewById(R.id.name30);
        TextView l30 = findViewById(R.id.lvl30);
        n30.setText(demiplane.getName());
        l30.setText(demiplane.getLevel());
        TextView n31 = findViewById(R.id.name31);
        TextView l31 = findViewById(R.id.lvl31);
        n31.setText(incendiaryCloud.getName());
        l31.setText(incendiaryCloud.getLevel());
        TextView n32 = findViewById(R.id.name32);
        TextView l32 = findViewById(R.id.lvl32);
        n32.setText(maze.getName());
        l32.setText(maze.getLevel());
        TextView n33 = findViewById(R.id.name33);
        TextView l33 = findViewById(R.id.lvl33);
        n33.setText(mightyFortress.getName());
        l33.setText(mightyFortress.getLevel());
        TextView n34 = findViewById(R.id.name34);
        TextView l34 = findViewById(R.id.lvl34);
        n34.setText(bladeOfDisaster.getName());
        l34.setText(bladeOfDisaster.getLevel());
        TextView n35 = findViewById(R.id.name35);
        TextView l35 = findViewById(R.id.lvl35);
        n35.setText(gate.getName());
        l35.setText(gate.getLevel());
        TextView n36 = findViewById(R.id.name36);
        TextView l36 = findViewById(R.id.lvl36);
        n36.setText(wish.getName());
        l36.setText(wish.getLevel());
    }

    public void details1(View details){
        i = 1;
        String s = Integer.toString(i);
        Intent intent = new Intent(MainActivity.this, DetailsActivity.class);
        intent.putExtra("s", s);
        startActivity(intent);
    }
    public void details2(View details){
        i = 2;
        String s = Integer.toString(i);
        Intent intent = new Intent(MainActivity.this, DetailsActivity.class);
        intent.putExtra("s", s);
        startActivity(intent);
    }
    public void details3(View details){
        i = 3;
        String s = Integer.toString(i);
        Intent intent = new Intent(MainActivity.this, DetailsActivity.class);
        intent.putExtra("s", s);
        startActivity(intent);
    }public void details4(View details){
        i = 4;
        String s = Integer.toString(i);
        Intent intent = new Intent(MainActivity.this, DetailsActivity.class);
        intent.putExtra("s", s);
        startActivity(intent);
    }public void details5(View details){
        i = 5;
        String s = Integer.toString(i);
        Intent intent = new Intent(MainActivity.this, DetailsActivity.class);
        intent.putExtra("s", s);
        startActivity(intent);
    }public void details6(View details){
        i = 6;
        String s = Integer.toString(i);
        Intent intent = new Intent(MainActivity.this, DetailsActivity.class);
        intent.putExtra("s", s);
        startActivity(intent);
    }public void details7(View details){
        i = 7;
        String s = Integer.toString(i);
        Intent intent = new Intent(MainActivity.this, DetailsActivity.class);
        intent.putExtra("s", s);
        startActivity(intent);
    }public void details8(View details){
        i = 8;
        String s = Integer.toString(i);
        Intent intent = new Intent(MainActivity.this, DetailsActivity.class);
        intent.putExtra("s", s);
        startActivity(intent);
    }public void details9(View details){
        i = 9;
        String s = Integer.toString(i);
        Intent intent = new Intent(MainActivity.this, DetailsActivity.class);
        intent.putExtra("s", s);
        startActivity(intent);
    }public void details10(View details){
        i = 10;
        String s = Integer.toString(i);
        Intent intent = new Intent(MainActivity.this, DetailsActivity.class);
        intent.putExtra("s", s);
        startActivity(intent);
    }public void details11(View details){
        i = 11;
        String s = Integer.toString(i);
        Intent intent = new Intent(MainActivity.this, DetailsActivity.class);
        intent.putExtra("s", s);
        startActivity(intent);
    }public void details12(View details){
        i = 12;
        String s = Integer.toString(i);
        Intent intent = new Intent(MainActivity.this, DetailsActivity.class);
        intent.putExtra("s", s);
        startActivity(intent);
    }public void details13(View details){
        i = 13;
        String s = Integer.toString(i);
        Intent intent = new Intent(MainActivity.this, DetailsActivity.class);
        intent.putExtra("s", s);
        startActivity(intent);
    }public void details14(View details){
        i = 14;
        String s = Integer.toString(i);
        Intent intent = new Intent(MainActivity.this, DetailsActivity.class);
        intent.putExtra("s", s);
        startActivity(intent);
    }public void details15(View details){
        i = 15;
        String s = Integer.toString(i);
        Intent intent = new Intent(MainActivity.this, DetailsActivity.class);
        intent.putExtra("s", s);
        startActivity(intent);
    }public void details16(View details){
        i = 16;
        String s = Integer.toString(i);
        Intent intent = new Intent(MainActivity.this, DetailsActivity.class);
        intent.putExtra("s", s);
        startActivity(intent);
    }public void details17(View details){
        i = 17;
        String s = Integer.toString(i);
        Intent intent = new Intent(MainActivity.this, DetailsActivity.class);
        intent.putExtra("s", s);
        startActivity(intent);
    }public void details18(View details){
        i = 18;
        String s = Integer.toString(i);
        Intent intent = new Intent(MainActivity.this, DetailsActivity.class);
        intent.putExtra("s", s);
        startActivity(intent);
    }public void details19(View details){
        i = 19;
        String s = Integer.toString(i);
        Intent intent = new Intent(MainActivity.this, DetailsActivity.class);
        intent.putExtra("s", s);
        startActivity(intent);
    }public void details20(View details){
        i = 20;
        String s = Integer.toString(i);
        Intent intent = new Intent(MainActivity.this, DetailsActivity.class);
        intent.putExtra("s", s);
        startActivity(intent);
    }public void details21(View details){
        i = 21;
        String s = Integer.toString(i);
        Intent intent = new Intent(MainActivity.this, DetailsActivity.class);
        intent.putExtra("s", s);
        startActivity(intent);
    }public void details22(View details){
        i = 22;
        String s = Integer.toString(i);
        Intent intent = new Intent(MainActivity.this, DetailsActivity.class);
        intent.putExtra("s", s);
        startActivity(intent);
    }public void details23(View details){
        i = 23;
        String s = Integer.toString(i);
        Intent intent = new Intent(MainActivity.this, DetailsActivity.class);
        intent.putExtra("s", s);
        startActivity(intent);
    }public void details24(View details){
        i = 24;
        String s = Integer.toString(i);
        Intent intent = new Intent(MainActivity.this, DetailsActivity.class);
        intent.putExtra("s", s);
        startActivity(intent);
    }public void details25(View details){
        i = 25;
        String s = Integer.toString(i);
        Intent intent = new Intent(MainActivity.this, DetailsActivity.class);
        intent.putExtra("s", s);
        startActivity(intent);
    }public void details26(View details){
        i = 26;
        String s = Integer.toString(i);
        Intent intent = new Intent(MainActivity.this, DetailsActivity.class);
        intent.putExtra("s", s);
        startActivity(intent);
    }public void details27(View details){
        i = 27;
        String s = Integer.toString(i);
        Intent intent = new Intent(MainActivity.this, DetailsActivity.class);
        intent.putExtra("s", s);
        startActivity(intent);
    }public void details28(View details){
        i = 28;
        String s = Integer.toString(i);
        Intent intent = new Intent(MainActivity.this, DetailsActivity.class);
        intent.putExtra("s", s);
        startActivity(intent);
    }public void details29(View details){
        i = 29;
        String s = Integer.toString(i);
        Intent intent = new Intent(MainActivity.this, DetailsActivity.class);
        intent.putExtra("s", s);
        startActivity(intent);
    }public void details30(View details){
        i = 30;
        String s = Integer.toString(i);
        Intent intent = new Intent(MainActivity.this, DetailsActivity.class);
        intent.putExtra("s", s);
        startActivity(intent);
    }public void details31(View details){
        i = 31;
        String s = Integer.toString(i);
        Intent intent = new Intent(MainActivity.this, DetailsActivity.class);
        intent.putExtra("s", s);
        startActivity(intent);
    }public void details32(View details){
        i = 32;
        String s = Integer.toString(i);
        Intent intent = new Intent(MainActivity.this, DetailsActivity.class);
        intent.putExtra("s", s);
        startActivity(intent);
    }public void details33(View details){
        i = 33;
        String s = Integer.toString(i);
        Intent intent = new Intent(MainActivity.this, DetailsActivity.class);
        intent.putExtra("s", s);
        startActivity(intent);
    }public void details34(View details){
        i = 34;
        String s = Integer.toString(i);
        Intent intent = new Intent(MainActivity.this, DetailsActivity.class);
        intent.putExtra("s", s);
        startActivity(intent);
    }public void details35(View details){
        i = 35;
        String s = Integer.toString(i);
        Intent intent = new Intent(MainActivity.this, DetailsActivity.class);
        intent.putExtra("s", s);
        startActivity(intent);
    }public void details36(View details){
        i = 36;
        String s = Integer.toString(i);
        Intent intent = new Intent(MainActivity.this, DetailsActivity.class);
        intent.putExtra("s", s);
        startActivity(intent);
    }
}