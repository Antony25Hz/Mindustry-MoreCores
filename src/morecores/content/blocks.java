package morecores.content;

import mindustry.content.*;
import mindustry.world.*;
import mindustry.world.blocks.storage.*;
import mindustry.world.meta.*;

public class CustomBlocks {
    
    public static Block coreTier1, coreTier2, coreTier3;
    public static Block customWall;
    
    public static void load() {
        loadCores();
        loadWalls();
    }
    
    private static void loadCores() {
        // CORE TIER 1
        coreTier1 = new CoreBlock("core-tier1") {{
            size = 4;
            researchCostMultiplier = 0.5f;
            health = 3000;
            itemCapacity = 4000;
            requirements(Category.effect, 
                Items.copper, 4000, 
                Items.lead, 2000
            );
            research = Blocks.coreShard;
            unitType = UnitTypes.alpha;
            unitCapModifier = 0;
            targetable = false;
            buildCostMultiplier = 3f;
        }};
        
        // CORE TIER 2
        coreTier2 = new CoreBlock("core-tier2") {{
            size = 5;
            researchCostMultiplier = 0.5f;
            health = 4000;
            itemCapacity = 15000;
            requirements(Category.effect,
                Items.lead, 8000,
                Items.silicon, 4000,
                Items.titanium, 4000,
                Items.plastanium, 1000,
                Items.phaseFabric, 1000,
                Items.surgeAlloy, 1000
            );
            research = Blocks.coreNucleus;
            unitType = UnitTypes.beta;
            unitCapModifier = 32;
            targetable = false;
            buildCostMultiplier = 3f;
        }};
        
        // CORE TIER 3
        coreTier3 = new CoreBlock("core-tier3") {{
            size = 6;
            researchCostMultiplier = 0.5f;
            health = 5000;
            itemCapacity = 16000;
            requirements(Category.effect,
                Items.copper, 4000,
                Items.lead, 4000,
                Items.silicon, 4000,
                Items.titanium, 2000,
                Items.plastanium, 1000
            );
            research = coreTier2;
            unitType = UnitTypes.gamma;
            unitCapModifier = 32;
            targetable = false;
            buildCostMultiplier = 3f;
        }};
    }
    
    private static void loadWalls() {
        customWall = new Wall("custom-wall") {{
            requirements(Category.defense, 
                Items.copper, 6
            );
            health = 80 * 4;
        }};
    }
}