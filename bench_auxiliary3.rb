# coding: utf-8

def fuga()
  1000 * 1000
end

def hoge()

  fuga
end
 
ARGV[0].to_i.times do |n|
  hoge
end
