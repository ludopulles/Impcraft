package mod.impcraft.proxy;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.World;

public class ClientProxy extends CommonProxy {
	
	@Override
	public Object getClientGuiElement(int ID, EntityPlayer player, World world,
			int x, int y, int z) {
		TileEntity tileEntity = world.getTileEntity(x, y, z);
//		if (tileEntity instanceof TileEntityBuildBlock) {
//			return new GuiBuildBlock(player.inventory, (TileEntityBuildBlock) tileEntity);
//		}
		return null;
	}
}
