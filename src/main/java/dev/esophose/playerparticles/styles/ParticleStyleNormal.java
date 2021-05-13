package dev.esophose.playerparticles.styles;

import dev.esophose.playerparticles.config.CommentedFileConfiguration;
import dev.esophose.playerparticles.particles.PParticle;
import dev.esophose.playerparticles.particles.ParticleEffect;
import dev.esophose.playerparticles.particles.ParticlePair;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import org.bukkit.Location;

public class ParticleStyleNormal extends DefaultParticleStyle {

    protected ParticleStyleNormal() {
        super("normal", true, false, 0);
    }

    @Override
    public List<PParticle> getParticles(ParticlePair particle, Location location) {
        ParticleEffect particleEffect = particle.getEffect();

        return switch (particleEffect) {
            case AMBIENT_ENTITY_EFFECT, ANGRY_VILLAGER, BARRIER, BLOCK, DRIPPING_LAVA, DRIPPING_WATER,
                 HEART, ITEM, NOTE, SPIT, SQUID_INK, TOTEM_OF_UNDYING -> Collections.singletonList(new PParticle(location, 0.6, 0.6, 0.6, 0.0));
            case CLOUD -> Collections.singletonList(new PParticle(location, 0.0, 0.0, 0.0, 0.0));
            case DUST, HAPPY_VILLAGER -> Collections.singletonList(new PParticle(location, 0.5, 0.5, 0.5, 0.0));
            case ENCHANT -> Collections.singletonList(new PParticle(location, 0.6, 0.6, 0.6, 1.0));
            case FALLING_DUST -> Arrays.asList(new PParticle(location.add(0, 0.75, 0), 0.6, 0.4, 0.6, 0.0), new PParticle(location.add(0, 0.75, 0), 0.6, 0.4, 0.6, 0.0));
            case FLAME -> Collections.singletonList(new PParticle(location, 0.1, 0.1, 0.1, 0.05));
            case NAUTILUS, PORTAL -> Collections.singletonList(new PParticle(location, 0.5, 0.5, 0.5, 1.0));
            case UNDERWATER -> Arrays.asList(new PParticle(location, 0.5, 0.5, 0.5, 0.0), new PParticle(location, 0.5, 0.5, 0.5, 0.0),
                    new PParticle(location, 0.5, 0.5, 0.5, 0.0), new PParticle(location, 0.5, 0.5, 0.5, 0.0), new PParticle(location, 0.5, 0.5, 0.5, 0.0));
            default -> Collections.singletonList(new PParticle(location, 0.4, 0.4, 0.4, 0.0));
        };
    }

    @Override
    public void updateTimers() {

    }

    @Override
    protected List<String> getGuiIconMaterialNames() {
        return Collections.singletonList("DIRT");
    }

    @Override
    protected void setDefaultSettings(CommentedFileConfiguration config) {

    }

    @Override
    protected void loadSettings(CommentedFileConfiguration config) {

    }

}
