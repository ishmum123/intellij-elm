package org.frawa.elmtest.run.configuration;

import com.intellij.execution.configurations.ConfigurationFactory;
import com.intellij.execution.configurations.ConfigurationType;
import com.intellij.icons.AllIcons;
import org.jetbrains.annotations.NotNull;

import javax.swing.*;

public class ElmTestRunConfigurationType implements ConfigurationType {
    @Override
    public String getDisplayName() {
        return "Elm Test";
    }

    @Override
    public String getConfigurationTypeDescription() {
        return "Elm Test Runner";
    }

    @Override
    public Icon getIcon() {
        return AllIcons.General.Information;
    }

    @NotNull
    @Override
    public String getId() {
        return "ELM_TEST_RUN_CONFIGURATION";
    }

    @Override
    public ConfigurationFactory[] getConfigurationFactories() {
        return new ConfigurationFactory[]{new ElmTestConfigurationFactory(this)};
    }
}

