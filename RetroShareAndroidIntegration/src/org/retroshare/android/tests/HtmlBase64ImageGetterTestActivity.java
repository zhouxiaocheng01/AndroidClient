/**
 * @license
 *
 * Copyright (c) 2013 Gioacchino Mazzurco <gio@eigenlab.org>.
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 *
 */

package org.retroshare.android.tests;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ImageView;

import org.retroshare.android.utils.HtmlBase64ImageGetter;

public class HtmlBase64ImageGetterTestActivity extends Activity
{
	@Override
	public void onCreate(Bundle b)
	{
		super.onCreate(b);

		String base64Src = "data:image/png;base64,iVBORw0KGgoAAAANSUhEUgAAACAAAAAgCAIAAAD8GO2jAAAAA3NCSVQICAjb4U/gAAAACXBIWXMAAA7EAAAOxAGVKw4bAAACzklEQVRIibVWS08TURQ+dzqFKZROpg+balsKpE1jiUSQh0gwggsTYhpZqgtjMHFjTFTcuNOd8hPc4MLEBcaFEIORhYaoSSVIRYkgEKChQCktbaXv62JKAXs7w4z128y55/F9d86dMzOABTG59BTjbLFoMh2d9j0XZgDhcOj34tz6SH6ZziQy2WR+ObUymEzHhBkQxhgE4fU9Uyl1vzZe+8MTO6kgAFSUHTGxp6zaTlrB1Bl6hMtFBIKx2bGZe4Hod2LUxDZ3OR9XMWaZAqthz4i3L5WJCdQzSu3FhkFdpbNYAlUsEIn73ny7mcrEWmvu1ujPFyY0227XGi7EU8ER7414akuywPjcw0Q6DAD6qnoNYy1M0KtdrKoaAGIJ/+f5J8V4yC3ais2+8PQAiJz/3jYRfbXtfUWZgRAiFswHRg/PDgBZnF7cfEfWJnoD0enDs+dKIuSSvRYtBEZ9oU82XbeZO+MPe+KpkCQBlVJrZBsXAm99oY82XZeZ6zggsBz8MOy9DgAIUb2NL8fnHvnDXyQJmLn2Bkvf8NQuyckhQ1U95Fu0FpnkDYyz69uTkqjzWNveRxL5ytuEMxB9eRwGeZKic1Aq/C8BDBkBgRK0CARahHFGHicCRaGzlC1CiODMCVCIIF4SkO6AuBOp2OXICejVrnxIrz4uj9Ogri8kofmLVXu2yzmwsjVerTtnYpvlCVi0nd3OgeUcScsBAQBwGN0Oo5u3EcjoEgIAu9Ft3yXhQX6KBL6xxaBTk0toore1tl9BlYd25qMJ/2b0B+/UMGau0g4Aq2FPMh3hnce40zTFaCvsTbZbRCqR35afa6/GZvp5+4T5WnvdAwAYmujdiHh55+XWMQ1jEWAQGTTRw8A4K5wgZ5IlPQCyBKSMvYhAuZLbs2n2LwMhqpzW/JOAhetwGC9RiDaxTa6jV3hnS80djcpKK1RttfeZfTsg4g/+D5MwF/zpFwAAAABJRU5ErkJggg==";
		HtmlBase64ImageGetter gt = new HtmlBase64ImageGetter(getResources());

		ImageView iv = new ImageView(this);
		iv.setImageDrawable(gt.getDrawable(base64Src));

		setContentView(iv);
	}
}