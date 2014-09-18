package mod.impcraft;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.IIcon;
import net.minecraft.world.World;

public class BuildBlock extends Block {

	private IIcon[] icons = new IIcon[2];
	
	public BuildBlock(Material m) {
		super(m);
		setCreativeTab(CreativeTabs.tabBlock);
		setHardness(5.0F);
		setResistance(2.0F);
	}
	
	@Override
	public void registerBlockIcons(IIconRegister register) {
		icons[0] = register.registerIcon(ImpCraft.MODID + ":buildblock_top");
		icons[1] = register.registerIcon(ImpCraft.MODID + ":buildblock_side");
	}
	
	@Override
	public IIcon getIcon(int side, int metadata) {
		return side == 0 || side == 1 ? icons[0] : icons[1];
	}
	
	@Override
	public boolean onBlockActivated(World world, int x, int y, int z, EntityPlayer player, int side, float fx, float fy, float fz) {
		TileEntity tileEntity = world.getTileEntity(x, y, z);
		System.out.println(tileEntity == null);
		if (tileEntity == null || player.isSneaking()) {
			return false;
		}
		System.out.println("Opening GUI");
		player.openGui(ImpCraft.instance, 0, world, x, y, z);
		return true;
	}
}
