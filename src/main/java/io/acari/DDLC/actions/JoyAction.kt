package io.acari.DDLC.actions

import com.chrisrm.idea.MTConfig
import com.chrisrm.idea.MTThemes
import io.acari.DDLC.actions.themes.literature.club.BaseThemeAction
import com.intellij.openapi.actionSystem.AnActionEvent

/**
 * Forged in the flames of battle by alex.
 */
class JoyAction: BaseThemeAction() {
    override fun isSelected(e: AnActionEvent): Boolean = JoyManager.isOn()

    override fun setSelected(e: AnActionEvent, state: Boolean) {
        super.setSelected(e, state)
        JoyManager.toggle()
        val selectedTheme = MTConfig.getInstance().getSelectedTheme() as MTThemes
        ClubMemberOrchestrator.activate(selectedTheme)
    }
}