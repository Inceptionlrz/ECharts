/*
 * The MIT License (MIT)
 *
 * Copyright (c) 2014 abel533@gmail.com
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in
 * all copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN
 * THE SOFTWARE.
 */

package com.github.abel533.echarts;

import com.github.abel533.echarts.code.Trigger;
import com.github.abel533.echarts.style.TextStyle;

/**
 * @author liuzh
 */
public class Tooltip extends Basic implements Component {
    /**
     * 显示策略，可选为：true（显示） | false（隐藏）
     */
	private Boolean show;

	public Boolean show(){
		return this.show;
	}

	public Tooltip show(Boolean show){
		this.show = show;
		return this;
	}

    /**
     * tooltip主体内容显示策略，只需tooltip触发事件或显示axisPointer而不需要显示内容时可配置该项为falase，
     * 可选为：true（显示） | false（隐藏）
     */
	private Boolean showContent;

	public Boolean showContent(){
		return this.showContent;
	}

	public Tooltip showContent(Boolean showContent){
		this.showContent = showContent;
		return this;
	}

    /**
     * 触发类型，默认数据触发，见下图，可选为：'item' | 'axis'
     *
     * @see com.github.abel533.echarts.code.Trigger
     */
	private Trigger trigger;

	public Trigger trigger(){
		return this.trigger;
	}

	public Tooltip trigger(Trigger trigger){
		this.trigger = trigger;
		return this;
	}

    /**
     *
     */
	private Object position;

	public Object position(){
		return this.position;
	}

	public Tooltip position(Object position){
		this.position = position;
		return this;
	}

    /**
     * 位置指定，传入{Array}，如[x, y]， 固定位置[x, y]；传入{Function}，如function([x, y]) {return [newX,newY]}，默认显示坐标为输入参数，用户指定的新坐标为输出返回。
     */
	private Object formatter;

	public Object formatter(){
		return this.formatter;
	}

	public Tooltip formatter(Object formatter){
		this.formatter = formatter;
		return this;
	}

    /**
     * 内容格式器：{string}（Template） | {Function}，支持异步回调见表格下方
     */
	private String islandFormatter;

	public String islandFormatter(){
		return this.islandFormatter;
	}

	public Tooltip islandFormatter(String islandFormatter){
		this.islandFormatter = islandFormatter;
		return this;
	}

    /**
     * 默认20，显示延迟，添加显示延迟可以避免频繁切换，特别是在详情内容需要异步获取的场景，单位ms
     */
	private Integer showDelay;

	public Integer showDelay(){
		return this.showDelay;
	}

	public Tooltip showDelay(Integer showDelay){
		this.showDelay = showDelay;
		return this;
	}

    /**
     * 默认100，隐藏延迟，单位ms
     */
	private Integer hideDelay;

	public Integer hideDelay(){
		return this.hideDelay;
	}

	public Tooltip hideDelay(Integer hideDelay){
		this.hideDelay = hideDelay;
		return this;
	}

    /**
     * 动画变换时长，单位s，如果你希望tooltip的跟随实时响应，showDelay设置为0是关键，同时transitionDuration设0也会有交互体验上的差别
     */
	private Double transitionDuration;

	public Double transitionDuration(){
		return this.transitionDuration;
	}

	public Tooltip transitionDuration(Double transitionDuration){
		this.transitionDuration = transitionDuration;
		return this;
	}

    /**
     * 提示边框圆角，单位px，默认为4
     */
	private Integer borderRadius;

	public Integer borderRadius(){
		return this.borderRadius;
	}

	public Tooltip borderRadius(Integer borderRadius){
		this.borderRadius = borderRadius;
		return this;
	}

    /**
     * 坐标轴指示器，坐标轴触发有效
     */
    private AxisPointer axisPointer;

    /**
     * 坐标轴指示器，坐标轴触发有效
     */
    public AxisPointer axisPointer(){
        if (this.axisPointer == null) {
            this.axisPointer = new AxisPointer();
        }
        return this.axisPointer;
    }

    /**
     * 文本样式，默认为白色字体
     *
     * @see com.github.abel533.echarts.style.TextStyle
     */
    private TextStyle textStyle;

    /**
     * 文本样式，默认为白色字体
     *
     * @see com.github.abel533.echarts.style.TextStyle
     */
    public TextStyle textStyle(){
        if (this.textStyle == null) {
            this.textStyle = new TextStyle();
        }
        return this.textStyle;
    }
}
