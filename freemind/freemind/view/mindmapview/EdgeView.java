/*FreeMind - A Program for creating and viewing Mindmaps
 *Copyright (C) 2000  Joerg Mueller <joergmueller@bigfoot.com>
 *See COPYING for Details
 *
 *This program is free software; you can redistribute it and/or
 *modify it under the terms of the GNU General Public License
 *as published by the Free Software Foundation; either version 2
 *of the License, or (at your option) any later version.
 *
 *This program is distributed in the hope that it will be useful,
 *but WITHOUT ANY WARRANTY; without even the implied warranty of
 *MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 *GNU General Public License for more details.
 *
 *You should have received a copy of the GNU General Public License
 *along with this program; if not, write to the Free Software
 *Foundation, Inc., 59 Temple Place - Suite 330, Boston, MA  02111-1307, USA.
 */
/*$Id: EdgeView.java,v 1.2 2000-08-11 10:22:38 ponder Exp $*/

package freemind.view.mindmapview;

import java.awt.Graphics2D;
import java.awt.Color;

/**
 * This class represents a single Edge of a MindMap.
 */
public abstract class EdgeView {

    public abstract void update();

    public abstract void paint(Graphics2D g);

    public abstract Color getColor();
}
