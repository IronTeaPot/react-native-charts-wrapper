//
//  MyPieChartView.swift
//  SCBWealth
//
//  Override to disable unhighlight function
//

import Foundation

import Charts

open class MyPieChartView : PieChartView
{
  
  override open func highlightValue(_ highlight: Highlight?, callDelegate: Bool)
  {
    
    if highlight == nil
    {
      return
    }
    super.highlightValue(highlight, callDelegate: true)
  }
}
