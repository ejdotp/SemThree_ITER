----------------------------------------------------------------------------------
-- Company: 
-- Engineer: 
-- 
-- Create Date: 12/23/2023 02:37:16 PM
-- Design Name: 
-- Module Name: TwoBitComparator - dataflow
-- Project Name: 
-- Target Devices: 
-- Tool Versions: 
-- Description: 
-- 
-- Dependencies: 
-- 
-- Revision:
-- Revision 0.01 - File Created
-- Additional Comments:
-- 
----------------------------------------------------------------------------------


library IEEE;
use IEEE.STD_LOGIC_1164.ALL;

-- Uncomment the following library declaration if using
-- arithmetic functions with Signed or Unsigned values
--use IEEE.NUMERIC_STD.ALL;

-- Uncomment the following library declaration if instantiating
-- any Xilinx leaf cells in this code.
--library UNISIM;
--use UNISIM.VComponents.all;
--E. JAGADEESWAR PATRO-2241016309
entity TwoBitComparator is
    Port ( a : in STD_LOGIC;
           b : in STD_LOGIC;
           c : in STD_LOGIC;
           d : in STD_LOGIC;
           x : out STD_LOGIC;
           y : out STD_LOGIC;
           z : out STD_LOGIC);
end TwoBitComparator;

architecture dataflow of TwoBitComparator is

begin
x <= (a xnor c) and (b xnor d);
y <= (a and(not c))or((a xnor c) and (b and (not d)));
z <= ((not a) and c) or ((a xnor c) and ((not b) and d));
end dataflow;
