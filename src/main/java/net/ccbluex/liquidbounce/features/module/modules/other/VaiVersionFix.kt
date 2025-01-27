
package net.ccbluex.liquidbounce.features.module.modules.other

import net.ccbluex.liquidbounce.CrossSine
import net.ccbluex.liquidbounce.features.module.Module
import net.ccbluex.liquidbounce.features.module.ModuleCategory
import net.ccbluex.liquidbounce.features.module.ModuleInfo
import net.ccbluex.liquidbounce.ui.client.hud.element.elements.Notification
import net.ccbluex.liquidbounce.ui.client.hud.element.elements.NotifyType

@ModuleInfo(name = "ViaVersionFix", spacedName = "ViaVersion Fix", category = ModuleCategory.OTHER)
class ViaVersionFix : Module() {
    override fun onEnable() {
        CrossSine.hud.addNotification(
            Notification(
                "WARNING",
                "If you using this module in a low version server < 1.12.Server AntiCheat will detect this as a hack when you right click!",
                NotifyType.WARNING,
                4000,
                500
            )
        )
    }
}